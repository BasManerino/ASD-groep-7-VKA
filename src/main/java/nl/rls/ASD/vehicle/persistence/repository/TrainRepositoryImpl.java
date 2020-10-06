package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import nl.rls.ASD.vehicle.domain.Train;

public class TrainRepositoryImpl implements TrainRepository{

	@Override
	public Optional<Train> findByIdAndOwnerId(int id, int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Train> findByOwnerId(int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsByIdAndOwnerId(int id, int ownerId) {
		// TODO Auto-generated method stub
		return false;
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
		return false;
	}
    
}
