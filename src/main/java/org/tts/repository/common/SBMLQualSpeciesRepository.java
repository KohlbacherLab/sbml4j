/**
 * --------------------------------------------------------------------------
 *                                 SBML4j
 * --------------------------------------------------------------------------
 * University of Tuebingen, 2020.
 * 
 * This code is part of the SBML4j software package and subject to the terms
 * and conditions defined by its license (MIT License). For license details
 * please refer to the LICENSE file included as part of this source code
 * package.
 * 
 * For a full list of authors, please refer to the file AUTHORS.
 */
package org.tts.repository.common;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.tts.model.common.SBMLQualSpecies;

@Repository
public interface SBMLQualSpeciesRepository extends Neo4jRepository<SBMLQualSpecies, Long> {

	List<SBMLQualSpecies> findBysBaseName(String sBaseName);

	SBMLQualSpecies findBysBaseId(String sBaseId);

	@Query("MATCH "
			+ "(g:SBMLQualSpeciesGroup)"
			+ "-[h:HAS_GROUP_MEMBER]->"
			+ "(s:SBMLQualSpecies) "
			+ "WHERE g.entityUUID = $groupEntityUUID "
			+ "RETURN s")
	Iterable<SBMLQualSpecies> getSBMLQualSpeciesOfGroup(String groupEntityUUID);

	@Query("MATCH "
			+ "(s:SBMLQualSpecies)"
			+ "-[b:BQ]->"
			+ "(e:ExternalResourceEntity)"
			+ "-[KNOWNAS]->"
			+ "(n:NameNode)"
			+ "WHERE b.type = \"BIOLOGICAL_QUALIFIER\" "
			+ "AND b.qualifier IN [\"BQB_HAS_VERSION\", \"BQB_IS\", \"BQB_IS_ENCODED_BY\"] "
			+ "AND n.name = $name "
			+ "AND e.databaseFromUri = $databaseFromUri "
			+ "RETURN s")
	Iterable<SBMLQualSpecies> findByBQConnectionTo(String name, String databaseFromUri);

}
