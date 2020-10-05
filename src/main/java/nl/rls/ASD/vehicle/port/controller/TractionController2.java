package nl.rls.ASD.vehicle.port.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TractionService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/traction")
@Service("TractionController2")
public class TractionController2 {
    private final TractionService service;

    public TractionController2(TractionService service) {
        this.service = service;
    }
}
