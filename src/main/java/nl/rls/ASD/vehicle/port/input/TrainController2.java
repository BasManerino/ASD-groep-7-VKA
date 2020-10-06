package nl.rls.ASD.vehicle.port.input;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TrainApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/train")
public class TrainController2 implements TrainInputAdapter {
    
    @GetMapping(value = "/getId", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public boolean existsById(boolean check) {
    	TrainApplicationService service = new TrainApplicationService();
    	return service.getCompanyById(check);
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public boolean addNewTrain(Integer type, String nr, Date timeAtHannover, Date timeAtTransfer,
                               Integer tPoint, Integer compId) {
        // TODO: Request body
        TrainApplicationService service = new TrainApplicationService();
        return service.addNewTrain(type, nr, timeAtHannover, timeAtTransfer, tPoint, compId, new ArrayList<>(), new ArrayList<>());
    }

}
