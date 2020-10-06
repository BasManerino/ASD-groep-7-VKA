package nl.rls.ASD.vehicle.port.output;

import nl.rls.ASD.common.port.input.JourneyController2;
import nl.rls.ASD.common.port.input.JourneyInputAdapter;

public class TrainCompositionService2 implements TrainCompositionOutputAdapter {

	@Override
	public boolean getJourneyById(boolean check) {
		JourneyInputAdapter journeyController = new JourneyController2();
		return journeyController.existsById(check);
	}
	
}
