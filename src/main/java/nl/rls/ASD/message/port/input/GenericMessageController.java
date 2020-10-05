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
import nl.rls.ASD.message.port.service.GenericMessageApplicationService;
import nl.rls.ASD.vehicle.domain.TrainId;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/genericmessage")
public class GenericMessageController implements GenericMessageInputAdapter{
    private final GenericMessageApplicationService service;

    public GenericMessageController(GenericMessageApplicationService service) {
        this.service = service;
    }
    
    /*
    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public boolean createGenericMessage(String objectType, CompanyId company, String core, String variant, int timetableYear, Date startDate,
    		TrainId trainId, int messageStatus, int messageType, String messageTypeVersion, String messageIdentifier, Date messageDateTime,
    		String senderReference, CompanyId sender, CompanyId recipient) throws SQLException
    {
    	return service.createTrainCompositionMessage(objectType, company, core, variant, timetableYear, startDate,
        		trainId, messageStatus, messageType, messageTypeVersion, messageIdentifier, messageDateTime,
        		senderReference, sender, recipient);
    }*/
}
