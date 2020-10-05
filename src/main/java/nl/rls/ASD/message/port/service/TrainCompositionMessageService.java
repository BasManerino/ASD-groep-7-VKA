package nl.rls.ASD.message.port.service;

import nl.rls.ASD.Connect;
import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.common.port.input.CompanyInputAdapter;
import nl.rls.ASD.message.domain.TrainCompositionMessage;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import nl.rls.ASD.message.persistence.repository.TrainCompositionMessageRepository;
import nl.rls.ASD.vehicle.domain.TrainId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Date;

@Service
public class TrainCompositionMessageService {

	CompanyInputAdapter companyController;
	TrainCompositionMessageRepository repo;
	Connect connect;
	public boolean createTrainCompositionMessage(String objectType, CompanyId company, String core, String variant, int timetableYear, Date startDate, TrainId trainId, int messageStatus, int messageType, String messageTypeVersion, String messageIdentifier, Date messageDateTime, String senderReference, CompanyId sender, CompanyId recipient) throws SQLException {
		boolean companyCheck = companyController.existsById(company);
		
		if(!companyCheck) {
			return false;
		}
		
		TrainCompositionMessageId id = new TrainCompositionMessageId(repo.nextIdentity());
		TrainCompositionMessage tcm = new TrainCompositionMessage(id, objectType, company, core, variant, timetableYear, startDate, trainId);
		return true;
		
		
	}
	
}
