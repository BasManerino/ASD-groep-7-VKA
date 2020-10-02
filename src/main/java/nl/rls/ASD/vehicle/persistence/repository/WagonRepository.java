package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;

import nl.rls.composer.domain.Wagon;

public interface WagonRepository {
    List<Wagon> findByOwnerId(int ownerId);

    Optional<Wagon> findByIdAndOwnerId(int id, int ownerId);

    Optional<Wagon> findByNumberFreightAndOwnerId(String numberFreight, int ownerId);
}
