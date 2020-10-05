package nl.rls.ASD.vehicle.port.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TrainCompositionService2;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/traincomposition")
public class TrainCompositionController2 {
    private final TrainCompositionService2 service;

    public TrainCompositionController2(TrainCompositionService2 service) {
        this.service = service;
    }
}
