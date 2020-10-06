package nl.rls.ASD.common.port.input;

import nl.rls.ASD.common.port.service.CompanyApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public class LocationController2 implements LocationInputAdapter {
    @GetMapping(value = "/getId", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public boolean existsById(boolean check) {
        CompanyApplicationService service = new CompanyApplicationService();
        return service.getCompanyById(check);
    }
}
