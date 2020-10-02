package nl.rls.ASD.message.port.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.message.port.service.TrainCompositionMessageService;
import nl.rls.ci.url.BaseURL;

// Dit is de REST service.
@RestController
@RequestMapping(BaseURL.BASE_PATH + "/traincompositionmessage")
public class TrainCompositionMessageController{
    private final TrainCompositionMessageService service;

    public TrainCompositionMessageController(TrainCompositionMessageService service) {
        this.service = service;
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public boolean createTrainCompositionMessage() {
    	return service.createTrainCompositionMessage();
    }
}
