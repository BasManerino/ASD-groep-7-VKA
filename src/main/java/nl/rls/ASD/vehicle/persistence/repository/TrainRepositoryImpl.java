package nl.rls.ASD.vehicle.persistence.repository;

import nl.rls.ASD.vehicle.domain.Train;

import java.util.Random;

public class TrainRepositoryImpl implements TrainRepository{

	@Override
	public boolean getTrainById(boolean check) {
		// TODO Auto-generated method stub
		return check;
	}

	@Override
	public int nextIdentity() {
		// TODO: Actual connection to the db
		Random random = new Random();
		return random.nextInt(99999);
	}

	@Override
	public boolean store(Train train) {
		// TODO: Actual connection to the db
		return true;
	}
    
}
