package nl.rls.ASD.vehicle.port.input;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TractionInTrainApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/tractionintrain")
public class TractionInTrainController2 implements TractionInTrainInputAdapter {
    private final TractionInTrainApplicationService service;

    public TractionInTrainController2(TractionInTrainApplicationService service) {
        this.service = service;
    }
}
