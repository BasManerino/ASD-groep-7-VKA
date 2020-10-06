package nl.rls.ASD.vehicle.port.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import nl.rls.ASD.vehicle.port.output.TrainCompositionOutputAdapter;
import nl.rls.ASD.vehicle.port.output.TrainCompositionService2;

@Service
public class TrainCompositionApplicationService {
	
	public boolean addWagonToTainComposition(boolean check) throws SQLException {
		
		TrainCompositionOutputAdapter output = new TrainCompositionService2();
		output.getJourneyById(check);
		return false; // Todo
	}
	
}
