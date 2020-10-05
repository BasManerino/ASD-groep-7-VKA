package nl.rls.ASD.message.persistence.repository;

import java.sql.SQLException;

import nl.rls.ASD.message.domain.GenericMessage;
import nl.rls.ASD.message.domain.GenericMessageId;

public interface GenericMessageRepository{
	int nextIdentity();
	
    boolean getGenericMessageById(boolean check);
   
    GenericMessage saveGenericMessage(GenericMessage gm);
     
    void deleteGenericMessage(GenericMessage gm);
}
