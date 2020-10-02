package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;

import nl.rls.composer.domain.Wagon;

public class WagonRepositoryImpl implements WagonRepository {

	@Override
	public List<Wagon> findByOwnerId(int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Wagon> findByIdAndOwnerId(int id, int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Wagon> findByNumberFreightAndOwnerId(String numberFreight, int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
