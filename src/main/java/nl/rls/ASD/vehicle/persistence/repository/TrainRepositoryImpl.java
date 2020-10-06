package nl.rls.ASD.vehicle.persistence.repository;

import nl.rls.ASD.vehicle.domain.Train;
import java.util.Random;

public class TrainRepositoryImpl implements TrainRepository{

	@Override
	public boolean getTrainById(boolean check) {
		return check;
	}

	@Override
	public Train getTrainById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int nextIdentity() {
		Random random = new Random();
		return random.nextInt(99999);
	}

	@Override
	public boolean store(Train train) {
		return true;
	}
}
