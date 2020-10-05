package nl.rls.ASD.message.persistence.repository;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import nl.rls.ASD.message.domain.GenericMessage;
import nl.rls.ASD.message.domain.TrainCompositionMessage;

@Service("TrainCompositionMessage Repository")
public class GenericMessageRepositoryImpl implements GenericMessageRepository {

	@Override
	public <S extends GenericMessage> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends GenericMessage> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<GenericMessage> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<GenericMessage> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<GenericMessage> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GenericMessage entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends GenericMessage> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GenericMessage getGenericMessageById(int id) {
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
 
	/*
    private EntityManager em;
     
    public GenericMessageRepositoryImpl(EntityManager em) {
        this.em = em;
    }

	@Override
	public GenericMessage getGenericMessageById(int id) {
		return em.find(GenericMessage.class, id);
	}

	@Override
	public GenericMessage saveGenericMessage(GenericMessage gm) {
        if (gm.getId() == null) {
            em.persist(gm);
        } else {
            gm = em.merge(gm);
        }
        return gm;
	}

	@Override
	public void deleteGenericMessage(GenericMessage gm) {
        if (em.contains(gm)) {
            em.remove(gm);
        } else {
            em.merge(gm);
        }
	}*/
}