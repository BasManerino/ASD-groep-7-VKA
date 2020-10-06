package nl.rls.ASD.vehicle.persistence.repository;

import java.sql.SQLException;
import java.util.Optional;

import nl.rls.composer.domain.TrainComposition;

public class TrainCompositionRepositoryImpl implements TrainCompositionRepository{

	@Override
	public int nextIdentity() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Optional<TrainComposition> findByIdAndOwnerId(int id, int ownerId) {
		return null;
	}

}
