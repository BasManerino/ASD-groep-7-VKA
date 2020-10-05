package nl.rls.ASD.message.port.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.rls.ASD.common.domain.Company;
import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.common.port.input.CompanyInputAdapter;
import nl.rls.ASD.message.domain.TrainCompositionMessage;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import nl.rls.ASD.message.persistence.repository.TrainCompositionMessageRepository;
import nl.rls.ASD.vehicle.domain.TrainId;
import nl.rls.ASD.Connect;

@Service
public class TrainCompositionMessageService {

	@Autowired
	CompanyInputAdapter companyController;
	@Autowired
	TrainCompositionMessageRepository repo;
	@Autowired
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
