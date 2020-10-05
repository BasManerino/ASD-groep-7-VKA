package nl.rls.ASD.vehicle.port.input;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TrainApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/train")
public class TrainController2 implements TrainInputAdapter {
    private final TrainApplicationService service;

    public TrainController2(TrainApplicationService service) {
        this.service = service;
    }
}
