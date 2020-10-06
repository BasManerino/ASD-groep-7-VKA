package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;
import nl.rls.ASD.vehicle.domain.*;

public class MockRollingStockRepository implements RollingStockRepository{

	@Override
	public List<nl.rls.composer.domain.RollingStock> findAllByTrainCompositionIdAndTrainCompositionOwnerId(int trainCompositionId,
			int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<nl.rls.composer.domain.RollingStock> findByIdAndTrainCompositionIdAndTrainCompositionOwnerId(int rollingStockId,
			int trainCompositionId, int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveRollingStock(RollingStock rollingStock) {
		return true;
	}

}
