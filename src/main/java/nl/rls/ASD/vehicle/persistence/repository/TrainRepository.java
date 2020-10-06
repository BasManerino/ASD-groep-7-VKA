package nl.rls.ASD.vehicle.persistence.repository;

import nl.rls.ASD.vehicle.domain.Train;

public interface TrainRepository {
	int nextIdentity();

	boolean store(Train train);

	boolean getTrainById(boolean check);
}
