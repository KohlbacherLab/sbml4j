package org.tts.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.tts.model.SBMLSpecies;

@Repository
public interface SBMLSpeciesRepository extends Neo4jRepository<SBMLSpecies, Long> {
	public SBMLSpecies findBySBaseName(String sBaseName);

	public SBMLSpecies findBySBaseId(String sBaseId);
}
