package nl.rls.ASD.vehicle.port.output;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.vehicle.domain.Train;
import nl.rls.ASD.vehicle.domain.TrainCompositionId;
import nl.rls.ASD.vehicle.domain.Wagon;
import nl.rls.ASD.vehicle.domain.WagonCode;

public interface TrainCompositionOutputAdapter {
	
	boolean getJourneySectionById(JourneySectionId id, boolean check);
	Wagon getWagonById(WagonCode code, boolean check);
	Train[] getTrainsByTrainComposition(TrainCompositionId id);
	
}
