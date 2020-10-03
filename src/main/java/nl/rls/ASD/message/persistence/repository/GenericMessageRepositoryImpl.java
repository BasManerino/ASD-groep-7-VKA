package nl.rls.ASD.message.persistence.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import nl.rls.ASD.message.domain.GenericMessage;

@Service("GenericMessage Repository")
public class GenericMessageRepositoryImpl implements GenericMessageRepository {
 
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
	}
}