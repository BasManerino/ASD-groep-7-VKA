package nl.rls.ASD.vehicle.port.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TractionInTrainService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/tractionintrain")
@Service("TractionInTrainController2")
public class TractionInTrainController2 {
    private final TractionInTrainService service;

    public TractionInTrainController2(TractionInTrainService service) {
        this.service = service;
    }
}
