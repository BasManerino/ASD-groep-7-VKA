package nl.rls.ASD.message.port.output;

import nl.rls.ASD.common.domain.CompanyId;
//import nl.rls.ASD.common.port.controller.CompanyController2;
import nl.rls.ASD.common.port.service.CompanyApplicationService;

public class TrainCompositionMessageService implements TrainCompositionMessageOutputAdapter{

	@Override
	public CompanyId getCompanyById() {
		return null;
		/*Company service = new CompanyService();
		CompanyController2 controller = new CompanyController2(service);
		return controller.*/
	}

}
