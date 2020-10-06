package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;

import nl.rls.composer.domain.RollingStock;

public interface RollingStockRepository {
	
    List<RollingStock> findAllByTrainCompositionIdAndTrainCompositionOwnerId(int trainCompositionId, int ownerId);

    Optional<RollingStock> findByIdAndTrainCompositionIdAndTrainCompositionOwnerId(int rollingStockId, int trainCompositionId, int ownerId);
    
    boolean saveRollingStock(nl.rls.ASD.vehicle.domain.RollingStock rollingStock);
}
