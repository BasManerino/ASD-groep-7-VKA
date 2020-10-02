package nl.rls.ASD.vehicle.port.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TrainService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/train")
public class TrainController {
    private final TrainService service;

    public TrainController(TrainService service) {
        this.service = service;
    }
}
