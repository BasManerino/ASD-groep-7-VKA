package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;
import nl.rls.ASD.vehicle.domain.Train;

public interface TrainRepository {
	int nextIdentity();

	boolean store(Train train);

	boolean getTrainById(boolean check);
	Train getTrainById(int id);
}
