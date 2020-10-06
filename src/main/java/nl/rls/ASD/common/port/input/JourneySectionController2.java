package nl.rls.ASD.common.port.input;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.common.port.service.JourneySectionApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/journey")
public class JourneySectionController2 implements JourneySectionInputAdapter{
    
    @GetMapping(value = "/getId", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public boolean existsById(boolean check) {
    	JourneySectionApplicationService service = new JourneySectionApplicationService();
    	return service.getJourneyById(check);
    }

}
