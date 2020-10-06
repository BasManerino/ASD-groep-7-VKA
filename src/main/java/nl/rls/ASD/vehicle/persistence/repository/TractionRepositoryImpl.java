package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;

import nl.rls.ASD.vehicle.domain.TractionId;
import nl.rls.composer.domain.Traction;

public class TractionRepositoryImpl implements TractionRepository{

	@Override
	public Optional<Traction> findByIdAndOwnerId(int id, int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Traction> findByOwnerId(int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Traction> findByLocoTypeNumberAndOwnerId(Long locoNumber, int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public nl.rls.ASD.vehicle.domain.Traction tractionOfId(TractionId tractionId) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
