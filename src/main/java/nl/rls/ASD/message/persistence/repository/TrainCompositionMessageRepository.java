package nl.rls.ASD.message.persistence.repository;

import nl.rls.ASD.message.domain.TrainCompositionMessage;

public interface TrainCompositionMessageRepository {
	
    TrainCompositionMessage getTrainCompositionMessageById(int id);
 
    TrainCompositionMessage saveTrainCompositionMessage(TrainCompositionMessage tcm);
     
    void deleteTrainCompositionMessage(TrainCompositionMessage tcm);
}
