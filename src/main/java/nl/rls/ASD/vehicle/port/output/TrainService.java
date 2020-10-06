package nl.rls.ASD.vehicle.port.output;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;

import java.util.List;

public class TrainService implements TrainOutputAdapter {
    @Override
    public boolean doesCompanyExist(int compId) {
        return true;
    }

    @Override
    public boolean doesLocationExist(int tPoint) {
        return true;
    }

    @Override
    public boolean doJourneySectionsExist(List<JourneySectionId> jSections) {
        return true;
    }

    @Override
    public boolean doTrainCompositionMessagesExist(List<TrainCompositionMessageId> cMessages) {
        return true;
    }
}
