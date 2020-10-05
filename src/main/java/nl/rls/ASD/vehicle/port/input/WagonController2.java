package nl.rls.ASD.vehicle.port.input;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.WagonApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/wagon")
public class WagonController2 implements WagonInputAdapter {
    private final WagonApplicationService service;

    public WagonController2(WagonApplicationService service) {
        this.service = service;
    }
}
