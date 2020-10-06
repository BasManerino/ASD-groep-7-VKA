package nl.rls.ASD.vehicle.port.output;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;

import java.util.List;

public class TrainService implements TrainOutputAdapter {
    @Override
    public boolean doesCompanyExist(int compId) {
        return false;
    }

    @Override
    public boolean doesLocationExist(int tPoint) {
        return false;
    }

    @Override
    public boolean doJourneySectionsExist(List<JourneySectionId> jSections) {
        return false;
    }

    @Override
    public boolean doTrainCompositionMessagesExist(List<TrainCompositionMessageId> cMessages) {
        return false;
    }
}
