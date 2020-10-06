package nl.rls.ASD.message.persistence.repository;

import org.springframework.stereotype.Service;

import nl.rls.ASD.message.domain.GenericMessage;

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
