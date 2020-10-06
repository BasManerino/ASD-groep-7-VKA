package nl.rls.ASD.common.port.service;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.persistence.repository.JourneyRepository2;
import nl.rls.ASD.common.persistence.repository.JourneyRepositoryImpl;

@Service
public class JourneyApplicationService {
	
	public boolean getJourneyById(boolean check) {
		JourneyRepository2 repo = new JourneyRepositoryImpl();
		return repo.getJourneyById(check);
	}

}
