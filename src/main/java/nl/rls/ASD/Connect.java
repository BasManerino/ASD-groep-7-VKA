package nl.rls.ASD;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

import lombok.var;

public class Connect {
	
	public Connection connect() throws SQLException {
		String url = "jdbc:h2:mem:testdb";
		
		return (Connection) DriverManager.getConnection(url);
	}
}
