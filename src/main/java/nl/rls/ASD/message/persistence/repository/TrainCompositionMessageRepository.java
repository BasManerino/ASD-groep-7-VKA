package nl.rls.ASD.message.persistence.repository;

import java.sql.SQLException;

import nl.rls.ASD.message.domain.TrainCompositionMessage;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;

public interface TrainCompositionMessageRepository{
	int nextIdentity() throws SQLException;
	
    TrainCompositionMessage getTrainCompositionMessageById(TrainCompositionMessageId id);
   
    TrainCompositionMessage saveTrainCompositionMessage(TrainCompositionMessage gm);
     
    void deleteTrainCompositionMessage(TrainCompositionMessage gm);
}
