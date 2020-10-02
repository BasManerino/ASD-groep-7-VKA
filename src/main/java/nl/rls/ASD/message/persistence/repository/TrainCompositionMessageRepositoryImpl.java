package nl.rls.ASD.message.persistence.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import nl.rls.ASD.message.domain.TrainCompositionMessage;

@Service("TrainCompositionMessage Application Service")
public class TrainCompositionMessageRepositoryImpl implements TrainCompositionMessageRepository {
 
    private EntityManager em;
     
    public TrainCompositionMessageRepositoryImpl(EntityManager em) {
        this.em = em;
    }

	@Override
	public TrainCompositionMessage getTrainCompositionMessageById(int id) {
		return em.find(TrainCompositionMessage.class, id);
	}

	@Override
	public TrainCompositionMessage saveTrainCompositionMessage(TrainCompositionMessage tcm) {
        if (tcm.getId() == null) {
            em.persist(tcm);
        } else {
            tcm = em.merge(tcm);
        }
        return tcm;
	}

	@Override
	public void deleteTrainCompositionMessage(TrainCompositionMessage tcm) {
        if (em.contains(tcm)) {
            em.remove(tcm);
        } else {
            em.merge(tcm);
        }
	}
}