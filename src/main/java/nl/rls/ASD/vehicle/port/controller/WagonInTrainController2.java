package nl.rls.ASD.vehicle.port.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.WagonInTrainService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/wagonintrain")
public class WagonInTrainController2 {
    private final WagonInTrainService service;

    public WagonInTrainController2(WagonInTrainService service) {
        this.service = service;
    }
}
