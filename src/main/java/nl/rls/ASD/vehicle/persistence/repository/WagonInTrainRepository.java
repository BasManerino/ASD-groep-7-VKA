package nl.rls.ASD.vehicle.persistence.repository;

import java.util.Optional;

import nl.rls.composer.domain.WagonInTrain;

public interface WagonInTrainRepository {

    Optional<WagonInTrain> findById(Integer id);
}
