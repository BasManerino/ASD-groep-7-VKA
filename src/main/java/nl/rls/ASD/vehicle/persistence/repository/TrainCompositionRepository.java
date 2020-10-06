package nl.rls.ASD.vehicle.persistence.repository;

import java.sql.SQLException;
import java.util.Optional;

import nl.rls.ASD.vehicle.domain.TrainComposition;
import nl.rls.ASD.vehicle.domain.TrainCompositionId;

public interface TrainCompositionRepository {

	public int nextIdentity() throws SQLException;
	
    public Optional<TrainComposition> findById(TrainCompositionId id);

}
