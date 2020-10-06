package nl.rls.ASD.vehicle.port.output;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;

import java.util.List;

public interface TrainOutputAdapter {
    boolean doesCompanyExist(int compId);
    boolean doesLocationExist(int tPoint);
    boolean doJourneySectionsExist(List<JourneySectionId> jSections);
    boolean doTrainCompositionMessagesExist(List<TrainCompositionMessageId> cMessages);
}
