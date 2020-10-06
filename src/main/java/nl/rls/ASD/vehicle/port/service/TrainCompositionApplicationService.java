package nl.rls.ASD.vehicle.port.service;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import nl.rls.ASD.vehicle.domain.Train;
import nl.rls.ASD.vehicle.domain.TrainComposition;
import nl.rls.ASD.vehicle.domain.TrainCompositionId;
import nl.rls.ASD.vehicle.domain.Wagon;
import nl.rls.ASD.vehicle.domain.WagonCode;
import nl.rls.ASD.vehicle.domain.WagonInTrain;
import nl.rls.ASD.vehicle.persistence.repository.TrainCompositionRepository;
import nl.rls.ASD.vehicle.persistence.repository.TrainCompositionRepositoryImpl;
import nl.rls.ASD.vehicle.persistence.repository.WagonInTrainRepository;
import nl.rls.ASD.vehicle.persistence.repository.WagonInTrainRepositoryImpl;
import nl.rls.ASD.vehicle.port.output.TrainCompositionOutputAdapter;
import nl.rls.ASD.vehicle.port.output.TrainCompositionService2;

@Service
public class TrainCompositionApplicationService {
	
	public boolean addWagonToTainComposition(TrainCompositionId id, WagonCode code, boolean wagonCheck, boolean journeyCheck) throws SQLException {
		
		TrainCompositionRepository tcrepo = new TrainCompositionRepositoryImpl();
		WagonInTrainRepository wigrepo = new WagonInTrainRepositoryImpl();
		
//		Return false if TrainComposition does not exists
		Optional<TrainComposition> tc = tcrepo.findById(id);
		if(tc.isEmpty()) return false;
		
		TrainCompositionOutputAdapter output = new TrainCompositionService2();
		
		Wagon wagon = output.getWagonById(code, wagonCheck);
		
//		Return false if JourneySection does not exists
		boolean journeyCheckResult = output.getJourneySectionById(tc.get().getJourneySection().getId(), journeyCheck);
		if(!journeyCheckResult) return false;
		
		Train[] trains = output.getTrainsByTrainComposition(id);
		
		for(Train train : trains) {
			WagonInTrain wit = wigrepo.wagonInTrain(train.getId());
			wit.setWagon(wagon.getCode());
			wigrepo.store(wit);
		}
		
		return true; // Todo
	}
	
}
