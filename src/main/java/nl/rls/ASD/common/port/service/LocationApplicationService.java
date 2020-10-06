package nl.rls.ASD.common.port.service;

import nl.rls.ASD.common.persistence.repository.LocationRepositoryImpl;
import nl.rls.ASD.common.persistence.repository.LocationRepository2;

public class LocationApplicationService {
    public boolean getLocationById(boolean check) {
        LocationRepository2 repo = new LocationRepositoryImpl();
        return repo.getLocationById(check);
    }
}
