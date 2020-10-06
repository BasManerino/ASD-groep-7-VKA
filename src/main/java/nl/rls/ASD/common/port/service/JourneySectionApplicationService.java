package nl.rls.ASD.common.port.service;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.persistence.repository.JourneySectionRepository2;
import nl.rls.ASD.common.persistence.repository.JourneySectionRepositoryImpl;

@Service
public class JourneySectionApplicationService {
	
	public boolean getJourneyById(boolean check) {
		JourneySectionRepository2 repo = new JourneySectionRepositoryImpl();
		return repo.getJourneySectionById(check);
	}

}
