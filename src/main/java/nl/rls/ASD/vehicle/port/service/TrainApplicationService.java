package nl.rls.ASD.vehicle.port.service;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.persistence.repository.CompanyRepository2;
import nl.rls.ASD.common.persistence.repository.CompanyRepositoryImpl;
import nl.rls.ASD.vehicle.domain.*;
import nl.rls.ASD.vehicle.persistence.repository.MockRollingStockRepository;
import nl.rls.ASD.vehicle.persistence.repository.MockTractionRepository;
import nl.rls.ASD.vehicle.persistence.repository.MockTrainRepository;
import nl.rls.ASD.vehicle.persistence.repository.TractionRepository;
import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import nl.rls.ASD.vehicle.domain.Train;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepository;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepositoryImpl;
import nl.rls.ASD.vehicle.port.output.TrainOutputAdapter;
import nl.rls.ASD.vehicle.port.output.TrainService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TrainApplicationService {
	public boolean addNewTrain(int type, String nr, Date timeAtHannover, Date timeAtTransfer,
							   int tPoint, int compId, List<JourneySectionId> jSections, List<TrainCompositionMessageId> cMessages) {
		// TODO: Sequence Diagram updaten

		TrainRepository trainRepository = new TrainRepositoryImpl();
		int id = trainRepository.nextIdentity();

		TrainOutputAdapter outputAdapter = new TrainService();
		if (!outputAdapter.doesCompanyExist(compId)) { return false; }
		if (!outputAdapter.doesLocationExist(tPoint)) { return false; }
		if (!outputAdapter.doJourneySectionsExist(jSections)) { return false; }
		if (!outputAdapter.doTrainCompositionMessagesExist(cMessages)) { return false; }

		Train train = new Train(id, type, nr, timeAtHannover, timeAtTransfer, tPoint, compId, jSections, cMessages);
		return trainRepository.store(train);
	}

	public boolean getCompanyById(boolean check) {
		TrainRepository repo = new TrainRepositoryImpl();
		return repo.getTrainById(check);
	}
	
	public boolean addTractionToTrain(int trainId, int tractionIdInt, int position, int driverIndication) {
		TrainRepository trainRepo = new MockTrainRepository();
		
		//get train by id
		Train train = trainRepo.getTrainById(trainId);
		TractionId tractionId = new TractionId(tractionIdInt);
		
		if (train == null)
			return false;
		
		
		
		
		
		//get traction by id
		TractionRepository tractionRepo = new MockTractionRepository();
		
		if (tractionRepo.tractionOfId(tractionId) == null)
			return false;
		
		//free position on train
		train.freePosition(position);
		
		
		//create traction in train object
		TractionInTrain tractionInTrain = new TractionInTrain(tractionId, driverIndication);
		
		
		//save traction in train object to rollingstock repo
		
		return new MockRollingStockRepository().saveRollingStock(tractionInTrain);
	}
}
