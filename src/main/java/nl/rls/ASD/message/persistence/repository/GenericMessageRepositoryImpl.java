package nl.rls.ASD.message.persistence.repository;

import java.sql.SQLException;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import nl.rls.ASD.message.domain.GenericMessage;
import nl.rls.ASD.message.domain.GenericMessageId;
import nl.rls.ASD.message.domain.TrainCompositionMessage;

@Service("GenericMessage Repository")
public class GenericMessageRepositoryImpl implements GenericMessageRepository {

	@Override
	public int nextIdentity(){
		return 1;
	}

	@Override
	public boolean getGenericMessageById(boolean check) {
		return check;
	}

	@Override
	public GenericMessage saveGenericMessage(GenericMessage gm) {
		return gm;
	}

	@Override
	public void deleteGenericMessage(GenericMessage gm) {
	}

	
}
