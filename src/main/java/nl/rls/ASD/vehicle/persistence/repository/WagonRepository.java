package nl.rls.ASD.vehicle.persistence.repository;

import nl.rls.ASD.vehicle.domain.Wagon;
import nl.rls.ASD.vehicle.domain.WagonCode;


public interface WagonRepository {
    Wagon getWagonByCode(WagonCode code);

    Wagon saveWagon(Wagon w);

    void deleteWagon(Wagon w);
}
