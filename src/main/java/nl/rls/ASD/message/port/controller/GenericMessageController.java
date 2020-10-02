package nl.rls.ASD.message.port.controller;

import nl.rls.ASD.message.port.service.GenericMessageService;
import nl.rls.ci.url.BaseURL;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/genericmessage")
public class GenericMessageController {
    private final GenericMessageService service;

    public GenericMessageController(GenericMessageService service) {
        this.service = service;
    }
}
