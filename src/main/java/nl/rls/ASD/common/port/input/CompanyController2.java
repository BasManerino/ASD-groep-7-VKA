package nl.rls.ASD.common.port.input;

import nl.rls.ASD.common.domain.Company;
import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.common.port.service.CompanyApplicationService;
import nl.rls.ci.url.BaseURL;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/company")
public class CompanyController2 implements CompanyInputAdapter{
    private final CompanyApplicationService service;

    public CompanyController2(CompanyApplicationService service) {
        this.service = service;
    }
    
    @GetMapping(value = "/getId", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public boolean existsById(CompanyId id) {
    	return service.getCompanyById(id);
    }
}
