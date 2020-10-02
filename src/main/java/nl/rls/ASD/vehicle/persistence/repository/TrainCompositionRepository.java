package nl.rls.ASD.vehicle.persistence.repository;

import java.util.Optional;

import nl.rls.composer.domain.TrainComposition;

public interface TrainCompositionRepository {

    Optional<TrainComposition> findByIdAndOwnerId(int id, int ownerId);

}
