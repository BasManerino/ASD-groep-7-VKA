package nl.rls.ASD.message.port.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.message.port.service.GenericMessageService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/genericmessage")
public class GenericMessageController2 {
    private final GenericMessageService service;

    public GenericMessageController2(GenericMessageService service) {
        this.service = service;
    }
}
