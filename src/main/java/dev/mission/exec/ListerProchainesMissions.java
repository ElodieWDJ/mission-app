package dev.mission.exec;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
@Profile("listerNext")

public class ListerProchainesMissions implements Runnable {

	private static final Logger LOG = LoggerFactory.getLogger(ListerProchainesMissions.class);

	private MissionRepository missionRepository;

	public ListerProchainesMissions(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		List<Mission> listMissionsNext = missionRepository.listMissionsNext();
		LOG.warn("coucou");
		if (listMissionsNext.isEmpty()) {
			LOG.warn("Pas de mission!");
		} else {
			for (Mission mission : listMissionsNext) {
				LOG.warn(mission.getLibelle() + " " + mission.getTauxJournalier());
			}
		}
	}

}
