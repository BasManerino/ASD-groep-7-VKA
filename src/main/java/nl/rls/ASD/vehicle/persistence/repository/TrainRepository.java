package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;

import nl.rls.ASD.vehicle.domain.Train;

public interface TrainRepository {
    Optional<Train> findByIdAndOwnerId(int id, int ownerId);

    List<Train> findByOwnerId(int ownerId);

    boolean existsByIdAndOwnerId(int id, int ownerId);

    int nextIdentity();
    
    boolean store(Train train);
}
