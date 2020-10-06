package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;

import nl.rls.ASD.vehicle.domain.TractionId;
import nl.rls.composer.domain.Traction;

public interface TractionRepository {
    Optional<Traction> findByIdAndOwnerId(int id, int ownerId);

    List<Traction> findByOwnerId(int ownerId);

    Optional<Traction> findByLocoTypeNumberAndOwnerId(Long locoNumber, int ownerId);
    
    nl.rls.ASD.vehicle.domain.Traction tractionOfId(TractionId tractionId);
}
