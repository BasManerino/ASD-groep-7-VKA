package nl.rls.ASD.common.persistence.repository;

import org.springframework.stereotype.Service;

@Service("Location Repository")
public interface LocationRepository2 {
    boolean getLocationById(boolean check);
}
