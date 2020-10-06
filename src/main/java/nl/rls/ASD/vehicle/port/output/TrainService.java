package nl.rls.ASD.vehicle.port.output;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.common.port.input.*;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import nl.rls.ASD.message.port.input.TrainCompositionMessageController;
import nl.rls.ASD.message.port.input.TrainCompositionMessageInputAdapter;

import java.util.List;

public class TrainService implements TrainOutputAdapter {
    @Override
    public boolean doesCompanyExist(int compId) {
        CompanyInputAdapter compAdapter = new CompanyController2();
        return compAdapter.existsById(true);
    }

    @Override
    public boolean doesLocationExist(int tPoint) {
        LocationInputAdapter locationAdapter = new LocationController2();
        return locationAdapter.existsById(true);
    }

    @Override
    public boolean doJourneySectionsExist(List<JourneySectionId> jSections) {
        JourneyInputAdapter jsAdapter = new JourneyController2();
        for (JourneySectionId id : jSections) {
            if (!jsAdapter.existsById(true)) return false;
        }
        return true;
    }

    @Override
    public boolean doTrainCompositionMessagesExist(List<TrainCompositionMessageId> cMessages) {
        TrainCompositionMessageInputAdapter tcmAdapter = new TrainCompositionMessageController();
        for (TrainCompositionMessageId id : cMessages) {
            if (!tcmAdapter.existsById(true)) return false;
        }
        return true;
    }
}
