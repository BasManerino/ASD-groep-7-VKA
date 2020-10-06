package nl.rls.ASD.vehicle.persistence.repository;

import nl.rls.ASD.vehicle.domain.WagonCode;
import nl.rls.ASD.vehicle.domain.Wagon;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;

@Service("Wagon Repository")
public class WagonRepositoryImpl implements WagonRepository {

	public Wagon getWagonByCode(WagonCode code) {
		return null;
	}

	// Deze method zorgt ervoor dat de Wagon in de database wordt opgeslagen - Arjan
	public Wagon saveWagon(Wagon w) {
		return w;
	}

	public void deleteWagon(Wagon w) {

	}

}
