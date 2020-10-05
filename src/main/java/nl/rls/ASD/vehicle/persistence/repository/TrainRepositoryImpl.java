package nl.rls.ASD.vehicle.persistence.repository;

import nl.rls.ASD.vehicle.domain.Train;

import java.util.List;
import java.util.Optional;

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
		// TODO Get actual next ID from db
		return 1;
	}

	@Override
	public boolean store(Train train) {
		return false;
	}
    
}
