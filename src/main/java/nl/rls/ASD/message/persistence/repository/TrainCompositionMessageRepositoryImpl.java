package nl.rls.ASD.message.persistence.repository;

import nl.rls.ASD.Connect;
import nl.rls.ASD.message.domain.TrainCompositionMessage;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

@Service("TrainCompositionMessage Application Service")
public class TrainCompositionMessageRepositoryImpl implements TrainCompositionMessageRepository {

	Connect connect;
	@Override
	public <S extends TrainCompositionMessage> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TrainCompositionMessage> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TrainCompositionMessage> findById(TrainCompositionMessageId id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int nextIdentity() throws SQLException {
		Connection conn = connect.connect();
        ResultSet id = ((Statement) conn).executeQuery("select MAX(Id) from TrainCompositionMessage");
		return id.getInt(1);
	}

	@Override
	public boolean existsById(TrainCompositionMessageId id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<TrainCompositionMessage> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<TrainCompositionMessage> findAllById(Iterable<TrainCompositionMessageId> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(TrainCompositionMessageId id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TrainCompositionMessage entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends TrainCompositionMessage> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	/*
	@Override
	public TrainCompositionMessage getTrainCompositionMessageById(int id) {
		Connection conn = (Connection) DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		return em.find(TrainCompositionMessage.class, id);
	}

	@Override
	public TrainCompositionMessage saveTrainCompositionMessage(TrainCompositionMessage tcm) {
        if (tcm.getId() == null) {
            em.persist(tcm);
        } else {
            tcm = em.merge(tcm);
        }
        return tcm;
	}

	@Override
	public void deleteTrainCompositionMessage(TrainCompositionMessage tcm) {
        if (em.contains(tcm)) {
            em.remove(tcm);
        } else {
            em.merge(tcm);
        }
	}*/


}