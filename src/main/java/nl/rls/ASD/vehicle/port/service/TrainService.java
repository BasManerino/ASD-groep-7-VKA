package nl.rls.ASD.vehicle.port.service;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.common.domain.LocationId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import nl.rls.ASD.vehicle.domain.Train;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepository;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TrainService {
    public boolean addNewTrain(int type, String nr, Date timeAtHannover, Date timeAtTransfer, LocationId tPoint, CompanyId compId, List<JourneySectionId> jSections, List<TrainCompositionMessageId> cMessages) {

        // TODO: Nieuw sequence diagram in het document zetten

        TrainRepository trainRepository = new TrainRepositoryImpl();

        // TODO: What about the mStatuses?
        Train train = new Train(null, type, nr, timeAtHannover, timeAtTransfer, tPoint, compId, jSections, cMessages);
        return trainRepository.store(train);
    }
}
