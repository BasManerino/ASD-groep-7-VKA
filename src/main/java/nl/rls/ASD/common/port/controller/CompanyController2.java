package nl.rls.ASD.common.port.controller;

import nl.rls.ASD.common.port.service.CompanyService;
import nl.rls.ci.url.BaseURL;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/company")
public class CompanyController2 {
    private final CompanyService service;

    public CompanyController2(CompanyService service) {
        this.service = service;
    }
}
