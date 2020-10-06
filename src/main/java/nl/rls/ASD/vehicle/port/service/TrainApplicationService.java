package nl.rls.ASD.vehicle.port.service;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.persistence.repository.CompanyRepository2;
import nl.rls.ASD.common.persistence.repository.CompanyRepositoryImpl;
import nl.rls.ASD.vehicle.domain.*;
import nl.rls.ASD.vehicle.persistence.repository.MockTractionRepository;
import nl.rls.ASD.vehicle.persistence.repository.MockTrainRepository;
import nl.rls.ASD.vehicle.persistence.repository.TractionRepository;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepository;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepositoryImpl;

@Service
public class TrainApplicationService {
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
		
		
		
		return true;
		
		
		
	}
}
