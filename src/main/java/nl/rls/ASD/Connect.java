package nl.rls.ASD;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

public class Connect {
	
	public Connection connect() throws SQLException {
		Connection conn = (Connection) DriverManager.getConnection("jdbc:h2:mem:testdb");
		return conn;
	}
}
