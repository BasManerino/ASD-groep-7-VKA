package nl.rls.ASD.vehicle.port.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TrainCompositionService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/traincomposition")
public class TrainCompositionController {
    private final TrainCompositionService service;

    public TrainCompositionController(TrainCompositionService service) {
        this.service = service;
    }
}
