package nl.rls.ASD.vehicle.persistence.repository;

import java.sql.SQLException;

import nl.rls.ASD.vehicle.domain.TrainId;
import nl.rls.ASD.vehicle.domain.WagonInTrain;

public class WagonInTrainRepositoryImpl implements WagonInTrainRepository {

	@Override
	public int nextIdentity() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public WagonInTrain wagonInTrain(TrainId id) {
		return null;
	}

	@Override
	public boolean store(WagonInTrain wagonInTrain) {
		return true;
	}
	
}
