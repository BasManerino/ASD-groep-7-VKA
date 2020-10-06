package nl.rls.ASD.vehicle.persistence.repository;

import java.sql.SQLException;

import nl.rls.ASD.vehicle.domain.TrainId;
import nl.rls.ASD.vehicle.domain.WagonInTrain;

public interface WagonInTrainRepository {

	public int nextIdentity() throws SQLException;

	public WagonInTrain wagonInTrain(TrainId trainId);
	public boolean store(WagonInTrain wagonInTrain);
}
