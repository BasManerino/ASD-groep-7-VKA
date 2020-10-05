package nl.rls.ASD.message.persistence.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.stereotype.Service;

import lombok.var;
import nl.rls.ASD.Connect;
import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.message.domain.TrainCompositionMessage;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;

public class TrainCompositionMessageRepositoryImpl implements TrainCompositionMessageRepository {

	@Override
	public int nextIdentity() throws SQLException {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public TrainCompositionMessage getTrainCompositionMessageById(TrainCompositionMessageId id) {
		// TODO Auto-generated method stub
		return null;
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