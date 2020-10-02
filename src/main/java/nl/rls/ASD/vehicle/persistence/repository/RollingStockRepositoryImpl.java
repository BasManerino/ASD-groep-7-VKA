package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;

import nl.rls.composer.domain.RollingStock;

public class RollingStockRepositoryImpl implements RollingStockRepository {

	@Override
	public List<RollingStock> findAllByTrainCompositionIdAndTrainCompositionOwnerId(int trainCompositionId,
			int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<RollingStock> findByIdAndTrainCompositionIdAndTrainCompositionOwnerId(int rollingStockId,
			int trainCompositionId, int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
