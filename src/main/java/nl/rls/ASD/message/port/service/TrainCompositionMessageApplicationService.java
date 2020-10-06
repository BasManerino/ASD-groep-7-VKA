package nl.rls.ASD.message.port.service;

import java.sql.SQLException;
import java.util.Date;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.message.domain.GenericMessage;
import nl.rls.ASD.message.domain.GenericMessageId;
import nl.rls.ASD.message.domain.MessageHeader;
import nl.rls.ASD.message.domain.MessageStatus;
import nl.rls.ASD.message.domain.MessageType;
import nl.rls.ASD.message.domain.TrainCompositionMessage;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import nl.rls.ASD.message.persistence.repository.GenericMessageRepository;
import nl.rls.ASD.message.persistence.repository.GenericMessageRepositoryImpl;
import nl.rls.ASD.message.persistence.repository.TrainCompositionMessageRepository;
import nl.rls.ASD.message.persistence.repository.TrainCompositionMessageRepositoryImpl;
import nl.rls.ASD.message.port.output.TrainCompositionMessageOutputAdapter;
import nl.rls.ASD.message.port.output.TrainCompositionMessageService;
import nl.rls.ASD.vehicle.domain.TrainId;

public class TrainCompositionMessageApplicationService {

	public boolean createTrainCompositionMessage(String objectType, CompanyId company, String core, String variant, int timetableYear, Date startDate, 
			TrainId train, MessageStatus status, int messageType, String messageTypeVersion, String messageIdentifier, Date messageDateTime, 
			String senderReference, CompanyId sender, CompanyId recipient, 
			boolean companyCheck, boolean trainCheck, boolean senderCheck, boolean recipientCheck) throws SQLException {
		
		TrainCompositionMessageOutputAdapter output = new TrainCompositionMessageService();
		boolean companyCheckResult = output.getCompanyById(companyCheck);
		
		if(!companyCheckResult) {
			return false;
		}
		
		boolean trainCheckResult = output.getTrainById(trainCheck);
		
		if(!trainCheckResult) {
			return false;
		}
		
		TrainCompositionMessageRepository repo = new TrainCompositionMessageRepositoryImpl();
		TrainCompositionMessageId id = new TrainCompositionMessageId(repo.nextIdentity());
		TrainCompositionMessage tcm = new TrainCompositionMessage(id, objectType, company, core, variant, timetableYear, startDate, train);
		
		boolean senderCheckResult = output.getCompanyById(companyCheck);
		
		if(!senderCheckResult) {
			return false;
		}
		
		boolean recipientCheckResult = output.getCompanyById(companyCheck);
		
		if(!recipientCheckResult) {
			return false;
		}
		
		GenericMessageRepository gmRepo = new GenericMessageRepositoryImpl();
		GenericMessageId gmId = new GenericMessageId(gmRepo.nextIdentity());
		
		MessageType type = new MessageType(messageType, messageTypeVersion, senderReference, messageDateTime);
		MessageHeader header = new MessageHeader(senderReference, recipient, recipient);
		GenericMessage gm = new GenericMessage(header, type, status);
		
		gmRepo.saveGenericMessage(gm);
		
		tcm.setGenericMessageId(gmId);
		repo.saveTrainCompositionMessage(tcm);
		return true;
	}

	public boolean getTrainCompositionMessageById(boolean check) {
		TrainCompositionMessageRepository repo = new TrainCompositionMessageRepositoryImpl();
		return repo.getTrainCompositionMessageById(check);
	}
}
