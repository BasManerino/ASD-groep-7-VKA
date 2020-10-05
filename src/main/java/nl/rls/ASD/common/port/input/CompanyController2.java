package nl.rls.ASD.common.port.input;

import nl.rls.ASD.common.port.service.CompanyApplicationService;
import nl.rls.ci.url.BaseURL;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/company")
public class CompanyController2 implements CompanyInputAdapter{
    
    @GetMapping(value = "/getId", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public boolean existsById(boolean check) {
    	CompanyApplicationService service = new CompanyApplicationService();
    	return service.getCompanyById(check);
    }
}
