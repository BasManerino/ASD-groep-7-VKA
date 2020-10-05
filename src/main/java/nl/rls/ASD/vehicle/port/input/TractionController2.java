package nl.rls.ASD.vehicle.port.input;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TractionApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/traction")
public class TractionController2 implements TractionInputAdapter {
    private final TractionApplicationService service;

    public TractionController2(TractionApplicationService service) {
        this.service = service;
    }
}
