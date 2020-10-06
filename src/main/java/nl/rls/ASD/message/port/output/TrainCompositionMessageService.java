package nl.rls.ASD.message.port.output;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.common.port.input.CompanyController2;
import nl.rls.ASD.common.port.input.CompanyInputAdapter;
//import nl.rls.ASD.common.port.controller.CompanyController2;
import nl.rls.ASD.common.port.service.CompanyApplicationService;
import nl.rls.ASD.vehicle.port.input.TrainController2;
import nl.rls.ASD.vehicle.port.input.TrainInputAdapter;

public class TrainCompositionMessageService implements TrainCompositionMessageOutputAdapter{

	@Override
	public boolean getCompanyById(boolean check) {
		CompanyInputAdapter companyController = new CompanyController2();
		return companyController.existsById(check);
	}
	
	@Override
	public boolean getTrainById(boolean check) {
		TrainInputAdapter trainController = new TrainController2();
		return trainController.existsById(check);
	}

}
