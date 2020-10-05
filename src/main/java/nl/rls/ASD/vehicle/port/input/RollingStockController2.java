package nl.rls.ASD.vehicle.port.input;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.RollingStockApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/rollingstock")
public class RollingStockController2 implements RollingStockInputAdapter {
    private final RollingStockApplicationService service;

    public RollingStockController2(RollingStockApplicationService service) {
        this.service = service;
    }
}
