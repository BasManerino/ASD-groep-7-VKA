package nl.rls.ASD.vehicle.port.input;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;

import java.util.Date;
import java.util.List;

public interface TrainInputAdapter {
	boolean addNewTrain(int type, String nr, Date timeAtHannover, Date timeAtTransfer,
						int tPoint, int compId);

	boolean existsById(boolean check);
}
