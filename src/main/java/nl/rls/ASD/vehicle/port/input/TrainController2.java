package nl.rls.ASD.vehicle.port.input;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import nl.rls.ASD.vehicle.domain.RollingStock;
import nl.rls.ASD.vehicle.domain.RollingStockId;
import nl.rls.ASD.vehicle.domain.Train;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import nl.rls.ASD.vehicle.port.service.TrainApplicationService;
import nl.rls.ci.url.BaseURL;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
