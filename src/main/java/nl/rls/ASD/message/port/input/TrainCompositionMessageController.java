package nl.rls.ASD.message.port.input;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public boolean createTrainCompositionMessage(String objectType, CompanyId company, String core, String variant, int timetableYear, Date startDate,
    		TrainId train, MessageStatus messageStatus, int messageType, String messageTypeVersion, String messageIdentifier, Date messageDateTime,
    		String senderReference, CompanyId sender, CompanyId recipient, boolean companyCheck, boolean trainCheck, boolean senderCheck, boolean recipientCheck) throws SQLException
    {
    	TrainCompositionMessageApplicationService service = new TrainCompositionMessageApplicationService();
    	return service.createTrainCompositionMessage(objectType, company, core, variant, timetableYear, startDate,
        		train, messageStatus, messageType, messageTypeVersion, messageIdentifier, messageDateTime,
        		senderReference, sender, recipient, companyCheck, trainCheck, senderCheck, recipientCheck);
    }
}
