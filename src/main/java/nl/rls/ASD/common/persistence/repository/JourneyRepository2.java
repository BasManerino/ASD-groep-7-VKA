
package nl.rls.ASD.common.persistence.repository;

import org.springframework.stereotype.Service;

@Service("Journey Repository")
public interface JourneyRepository2{

    public boolean getJourneyById(boolean check);
    
}
