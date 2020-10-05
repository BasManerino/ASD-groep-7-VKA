package nl.rls.ASD.vehicle.port.input;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.WagonInTrainApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/wagonintrain")
public class WagonInTrainController2 implements WagonInTrainInputAdapter {
    private final WagonInTrainApplicationService service;

    public WagonInTrainController2(WagonInTrainApplicationService service) {
        this.service = service;
    }
}
