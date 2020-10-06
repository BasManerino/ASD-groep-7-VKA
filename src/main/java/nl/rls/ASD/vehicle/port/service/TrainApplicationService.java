package nl.rls.ASD.vehicle.port.service;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import nl.rls.ASD.vehicle.domain.Train;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepository;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepositoryImpl;
import nl.rls.ASD.vehicle.port.output.TrainOutputAdapter;
import nl.rls.ASD.vehicle.port.output.TrainService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TrainApplicationService {
    public boolean addNewTrain(int type, String nr, Date timeAtHannover, Date timeAtTransfer,
                               int tPoint, int compId, List<JourneySectionId> jSections, List<TrainCompositionMessageId> cMessages) {
        // TODO: Sequence Diagram updaten

        TrainRepository trainRepository = new TrainRepositoryImpl();
        int id = trainRepository.nextIdentity();

        TrainOutputAdapter outputAdapter = new TrainService();
        if (!outputAdapter.doesCompanyExist(compId)) { return false; }
        if (!outputAdapter.doesLocationExist(tPoint)) { return false; }
        if (!outputAdapter.doJourneySectionsExist(jSections)) { return false; }
        if (!outputAdapter.doTrainCompositionMessagesExist(cMessages)) { return false; }

        Train train = new Train(id, type, nr, timeAtHannover, timeAtTransfer, tPoint, compId, jSections, cMessages);
        return trainRepository.store(train);
    }

}
