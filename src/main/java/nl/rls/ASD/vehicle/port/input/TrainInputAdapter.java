package nl.rls.ASD.vehicle.port.input;

import java.util.Date;

public interface TrainInputAdapter {
	boolean addNewTrain(Integer type, String nr, Date timeAtHannover, Date timeAtTransfer,
						Integer tPoint, Integer compId);

	boolean existsById(boolean check);
}
