package nl.rls.ASD.message.persistence.repository;

import nl.rls.ASD.message.domain.GenericMessage;

public interface GenericMessageRepository{
	int nextIdentity();
	
    boolean getGenericMessageById(boolean check);
   
    GenericMessage saveGenericMessage(GenericMessage gm);
     
    void deleteGenericMessage(GenericMessage gm);
}
