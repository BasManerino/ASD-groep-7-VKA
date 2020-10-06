
package nl.rls.ASD.common.persistence.repository;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.domain.JourneySection;

@Service("Journey Repository")
public interface JourneySectionRepository2{

	public int nextIdentity() throws SQLException;
	
    public boolean getJourneySectionById(boolean check);
    
    JourneySection saveJourneySection(JourneySection js);

    void deleteJourneySection(JourneySection js);
    
}
