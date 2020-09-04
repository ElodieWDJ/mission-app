package dev.mission;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import dev.mission.repository.MissionRepository;

@DataJpaTest
public class MissionRepositoryTests {
	private static final Logger LOG = LoggerFactory.getLogger(MissionRepositoryTests.class);

	@Autowired
	TestEntityManager entityManager;

	@Autowired
	MissionRepository missionRepository;

	@Test
	void findByDateDebutGreaterThanEqual() {
		// TODO insérer des données avec `entityManager`
		// TODO exécuter la requête
		// TODO vérifier le résultat
	}

	@Test
	void findByDateDebutGreaterThanEqualAndTauxJournalierGreaterThanEqual() {
		// TODO insérer des données avec `entityManager`
		// TODO exécuter la requête
	}
}
