package nl.rls.ASD.vehicle.persistence.repository;

import java.sql.SQLException;
import java.util.Optional;

import nl.rls.composer.domain.TrainComposition;

public interface TrainCompositionRepository {

	public int nextIdentity() throws SQLException;
	
    public Optional<TrainComposition> findByIdAndOwnerId(int id, int ownerId);

}
