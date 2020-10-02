package nl.rls.ASD.vehicle.port.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TractionInTrainService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/tractionintrain")
public class TractionInTrainController {
    private final TractionInTrainService service;

    public TractionInTrainController(TractionInTrainService service) {
        this.service = service;
    }
}
