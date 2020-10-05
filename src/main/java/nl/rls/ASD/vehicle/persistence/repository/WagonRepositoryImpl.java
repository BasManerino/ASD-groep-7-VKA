package nl.rls.ASD.vehicle.persistence.repository;

import nl.rls.ASD.vehicle.domain.WagonCode;
import nl.rls.ASD.vehicle.domain.Wagon;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service("Wagon Repository")
public class WagonRepositoryImpl implements WagonRepository {

	private EntityManager em;

	public WagonRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public Wagon getWagonByCode(WagonCode code) {
		return em.find(Wagon.class, code);
	}

	@Override
	public Wagon saveWagon(Wagon w) {
		if (w.getCode() == null) {
			em.persist(w);
		} else {
			w = em.merge(w);
		}
		return w;
	}

	@Override
	public void deleteWagon(Wagon w) {
		if (em.contains(w)) {
			em.remove(w);
		} else {
			em.merge(w);
		}
	}

}
