package nl.rls.ASD.vehicle.port.input;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TrainCompositionApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/traincomposition")
public class TrainCompositionController2 implements TrainCompositionInputAdapter {
    private final TrainCompositionApplicationService service;

    public TrainCompositionController2(TrainCompositionApplicationService service) {
        this.service = service;
    }
}
