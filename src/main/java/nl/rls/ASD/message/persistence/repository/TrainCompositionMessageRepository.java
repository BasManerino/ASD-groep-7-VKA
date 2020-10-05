package nl.rls.ASD.message.persistence.repository;

import java.sql.SQLException;

import org.springframework.data.repository.CrudRepository;

import nl.rls.ASD.message.domain.TrainCompositionMessage;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;

public interface TrainCompositionMessageRepository extends CrudRepository<TrainCompositionMessage, TrainCompositionMessageId>{
	int nextIdentity() throws SQLException;
}
