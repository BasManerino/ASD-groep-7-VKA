package nl.rls.ASD.common.persistence.repository;

import java.sql.SQLException;

import nl.rls.ASD.common.domain.JourneySection;

public class JourneySectionRepositoryImpl implements JourneySectionRepository2 {

	@Override
	public int nextIdentity() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean getJourneySectionById(boolean check) {
		return check;
	}
	
	@Override
	public JourneySection saveJourneySection(JourneySection js) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteJourneySection(JourneySection js) {
		// TODO Auto-generated method stub
		
	}
}