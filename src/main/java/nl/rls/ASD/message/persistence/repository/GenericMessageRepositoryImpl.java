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
	public int nextIdentity() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GenericMessage getGenericMessageById(GenericMessageId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericMessage saveGenericMessage(GenericMessage gm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGenericMessage(GenericMessage gm) {
		// TODO Auto-generated method stub
		
	}

	
}
