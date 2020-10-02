package nl.rls.ASD.vehicle.port.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.RollingStockService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/rollingstock")
public class RollingStockController {
    private final RollingStockService service;

    public RollingStockController(RollingStockService service) {
        this.service = service;
    }
}
