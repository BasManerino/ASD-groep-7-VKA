package nl.rls.ASD.vehicle.port.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import nl.rls.ASD.vehicle.persistence.repository.TrainCompositionRepository;
import nl.rls.ASD.vehicle.persistence.repository.TrainCompositionRepositoryImpl;
import nl.rls.ASD.vehicle.port.output.TrainCompositionOutputAdapter;
import nl.rls.ASD.vehicle.port.output.TrainCompositionService2;

@Service
public class TrainCompositionApplicationService {
	
	public boolean addWagonToTainComposition(boolean journeyCheck) throws SQLException {
		
		TrainCompositionOutputAdapter output = new TrainCompositionService2();
		boolean journeyCheckResult = output.getJourneySectionById(journeyCheck);
		if(!journeyCheckResult) {
			return false;
		}
		
		TrainCompositionRepository repo = new TrainCompositionRepositoryImpl();
		
		return true; // Todo
	}
	
}
