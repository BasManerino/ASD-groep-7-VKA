package nl.rls.ASD.message.persistence.repository;

import java.sql.SQLException;

import org.springframework.data.repository.CrudRepository;

import nl.rls.ASD.message.domain.GenericMessage;

public interface GenericMessageRepository extends CrudRepository<GenericMessage, String>{
	int nextIdentity() throws SQLException;
}
