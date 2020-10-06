package nl.rls.ASD.message.persistence.repository;

import java.sql.SQLException;

import nl.rls.ASD.message.domain.TrainCompositionMessage;

public class TrainCompositionMessageRepositoryImpl implements TrainCompositionMessageRepository {

	@Override
	public int nextIdentity() throws SQLException {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean getTrainCompositionMessageById(boolean check) {
		return check;
	}

	@Override
	public TrainCompositionMessage saveTrainCompositionMessage(TrainCompositionMessage gm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTrainCompositionMessage(TrainCompositionMessage gm) {
		// TODO Auto-generated method stub
		
	}
}