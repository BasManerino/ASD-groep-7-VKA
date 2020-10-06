package nl.rls.ASD.message.port.input;

import java.sql.SQLException;
import java.util.Date;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.message.domain.MessageStatus;
import nl.rls.ASD.vehicle.domain.TrainId;

public interface TrainCompositionMessageInputAdapter{
	boolean createTrainCompositionMessage(String objectType, Integer company, String core, String variant, int timetableYear, Date startDate,
			Integer trainId, MessageStatus messageStatus, int messageType, String messageTypeVersion, String messageIdentifier, Date messageDateTime,
    		String senderReference, Integer sender, Integer recipient, boolean companyCheck, boolean trainCheck, boolean senderCheck, boolean recipientCheck) throws SQLException;

	boolean existsById(boolean check);
}
