package nl.rls.ASD.vehicle.port.output;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.common.port.input.JourneySectionController2;
import nl.rls.ASD.common.port.input.JourneySectionInputAdapter;
import nl.rls.ASD.vehicle.domain.Train;
import nl.rls.ASD.vehicle.domain.TrainCompositionId;
import nl.rls.ASD.vehicle.domain.Wagon;
import nl.rls.ASD.vehicle.domain.WagonCode;
import nl.rls.ASD.vehicle.port.input.WagonController2;
import nl.rls.ASD.vehicle.port.input.WagonInputAdapter;

public class TrainCompositionService2 implements TrainCompositionOutputAdapter {

	@Override
	public boolean getJourneySectionById(JourneySectionId id, boolean check) {
		JourneySectionInputAdapter journeySectionController = new JourneySectionController2();
		return journeySectionController.existsById(check);
	}
	
	@Override
	public Wagon getWagonById(WagonCode code, boolean check) {
		WagonInputAdapter wagonController = new WagonController2();
		return wagonController.getByCode(code, check);
	}

	@Override
	public Train[] getTrainsByTrainComposition(TrainCompositionId id) {
		return new Train[] {};
	}
	
}
