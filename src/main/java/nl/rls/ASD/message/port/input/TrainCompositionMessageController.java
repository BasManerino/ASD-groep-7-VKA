package nl.rls.ASD.message.port.input;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.message.domain.TrainCompositionMessage;
import nl.rls.ASD.message.port.service.TrainCompositionMessageService;
import nl.rls.ASD.vehicle.domain.TrainId;
import nl.rls.ci.url.BaseURL;
import nl.rls.util.Response;

// Dit is de REST service.
@RestController
@RequestMapping(BaseURL.BASE_PATH + "/traincompositionmessage")
public class TrainCompositionMessageController implements TrainCompositionMessageInputAdapter{
    private final TrainCompositionMessageService service;

    public TrainCompositionMessageController(TrainCompositionMessageService service) {
        this.service = service;
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public boolean createTrainCompositionMessage(String objectType, CompanyId company, String core, String variant, int timetableYear, Date startDate,
    		TrainId trainId, int messageStatus, int messageType, String messageTypeVersion, String messageIdentifier, Date messageDateTime,
    		String senderReference, CompanyId sender, CompanyId recipient) 
    {
    	return service.createTrainCompositionMessage(objectType, company, core, variant, timetableYear, startDate,
        		trainId, messageStatus, messageType, messageTypeVersion, messageIdentifier, messageDateTime,
        		senderReference, sender, recipient);
    }
}
