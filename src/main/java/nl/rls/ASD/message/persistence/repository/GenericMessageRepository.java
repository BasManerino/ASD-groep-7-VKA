package nl.rls.ASD.message.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import nl.rls.ASD.message.domain.GenericMessage;

public interface GenericMessageRepository extends CrudRepository<GenericMessage, String>{
	
    GenericMessage getGenericMessageById(int id);
 
    GenericMessage saveGenericMessage(GenericMessage gm);
     
    void deleteGenericMessage(GenericMessage gm);
}
