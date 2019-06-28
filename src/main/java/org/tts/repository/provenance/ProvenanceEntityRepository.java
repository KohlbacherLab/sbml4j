package org.tts.repository.provenance;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.tts.model.common.GraphEnum.ProvenanceGraphEdgeType;
import org.tts.model.provenance.ProvenanceEntity;

@Repository
public interface ProvenanceEntityRepository extends Neo4jRepository<ProvenanceEntity, Long> {

	@Query(value = "MATCH p=(e1:ProvenanceEntity {entityUUID: {0}})-" +
							"[:PROV {provenanceGraphEdgeType: {2}}]-" +
							"(e2:ProvenanceEntity {entityUUID: {1}}) " +
					"RETURN count(p) > 0")
	boolean areProvenanceEntitiesConnectedWithProvenanceEdgeType(String sourceEntityUUID, String targetEntityUUID,
			ProvenanceGraphEdgeType edgetype);

}
