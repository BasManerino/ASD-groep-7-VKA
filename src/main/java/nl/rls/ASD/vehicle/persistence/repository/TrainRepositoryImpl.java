package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;

import nl.rls.composer.domain.Train;

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
    
}
