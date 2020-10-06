package nl.rls.ASD.message.port.input;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.message.domain.MessageStatus;
import nl.rls.ASD.message.port.service.TrainCompositionMessageApplicationService;
import nl.rls.ASD.vehicle.domain.TrainId;
import nl.rls.ci.url.BaseURL;

// Dit is de REST service.
@RestController
@RequestMapping(BaseURL.BASE_PATH + "/traincompositionmessage")
public class TrainCompositionMessageController implements TrainCompositionMessageInputAdapter{

	@ExceptionHandler
    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public boolean createTrainCompositionMessage(String objectType, Integer company, String core, String variant, int timetableYear, Date startDate,
    		Integer train, MessageStatus messageStatus, int messageType, String messageTypeVersion, String messageIdentifier, Date messageDateTime,
    		String senderReference, Integer sender, Integer recipient, boolean companyCheck, boolean trainCheck, boolean senderCheck, boolean recipientCheck) throws SQLException {
    	TrainCompositionMessageApplicationService service = new TrainCompositionMessageApplicationService();
    	CompanyId company2 = new CompanyId(company);
    	TrainId train2 = new TrainId(train);
    	CompanyId sender2 = new CompanyId(sender);
    	CompanyId recipient2 = new CompanyId(recipient);
    	return service.createTrainCompositionMessage(objectType, company2, core, variant, timetableYear, startDate,
        		train2, messageStatus, messageType, messageTypeVersion, messageIdentifier, messageDateTime,
        		senderReference, sender2, recipient2, companyCheck, trainCheck, senderCheck, recipientCheck);
    }
}
