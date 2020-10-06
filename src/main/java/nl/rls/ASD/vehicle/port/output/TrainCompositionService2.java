package nl.rls.ASD.vehicle.port.output;

import nl.rls.ASD.common.port.input.JourneySectionController2;
import nl.rls.ASD.common.port.input.JourneySectionInputAdapter;

public class TrainCompositionService2 implements TrainCompositionOutputAdapter {

	@Override
	public boolean getJourneySectionById(boolean check) {
		JourneySectionInputAdapter journeySectionController = new JourneySectionController2();
		return journeySectionController.existsById(check);
	}
	
}
