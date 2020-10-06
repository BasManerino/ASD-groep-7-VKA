package nl.rls.ASD.vehicle.port.input;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.domain.TrainCompositionId;
import nl.rls.ASD.vehicle.domain.WagonCode;
import nl.rls.ASD.vehicle.port.service.TrainCompositionApplicationService;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/traincomposition")
public class TrainCompositionController2 implements TrainCompositionInputAdapter {
    
    @PostMapping(value = "/addWagon", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addWagonToTrainComposition(int id, WagonCode wagonCode, boolean journeyCheck, boolean wagonCheck) throws SQLException
    {
    	TrainCompositionApplicationService service = new TrainCompositionApplicationService();
    	TrainCompositionId tcid = new TrainCompositionId(id);
    	return service.addWagonToTainComposition(tcid, wagonCode, journeyCheck, wagonCheck);
    }
}
