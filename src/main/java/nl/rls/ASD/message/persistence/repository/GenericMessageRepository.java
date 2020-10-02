package nl.rls.ASD.message.persistence.repository;

import nl.rls.ASD.message.domain.GenericMessage;
import nl.rls.ASD.message.domain.TrainCompositionMessage;

public interface GenericMessageRepository {
	
    GenericMessage getGenericMessageById(int id);
 
    GenericMessage saveGenericMessage(GenericMessage gm);
     
    void deleteGenericMessage(GenericMessage gm);
}
