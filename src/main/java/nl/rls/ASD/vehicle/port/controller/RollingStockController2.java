package nl.rls.ASD.vehicle.port.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.RollingStockService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/rollingstock")
@Service("RollingStockController2")
public class RollingStockController2 {
    private final RollingStockService service;

    public RollingStockController2(RollingStockService service) {
        this.service = service;
    }
}
