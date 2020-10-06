package nl.rls.ASD.vehicle.port.input;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.TrainApplicationService;
import nl.rls.ci.url.BaseURL;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/train")
public class TrainController2 implements TrainInputAdapter {
    private final TrainApplicationService service;

    public TrainController2(TrainApplicationService service) {
        this.service = service;
    }

    public boolean addNewTrain(int type, String nr, Date timeAtHannover, Date timeAtTransfer,
                               int tPoint, int compId, List<JourneySectionId> jSections, List<TrainCompositionMessageId> cMessage) {
        TrainApplicationService service = new TrainApplicationService();
        return service.addNewTrain(type, nr, timeAtHannover, timeAtTransfer, tPoint, compId, jSections, cMessage);
    }
}
