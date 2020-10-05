package nl.rls.ASD;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.stereotype.Service;

import lombok.var;

@Service("Connect")
public class Connect {
	
	public Connection connect() throws SQLException {
		String url = "jdbc:h2:mem:testdb";
		
		return (Connection) DriverManager.getConnection(url);
	}
}
