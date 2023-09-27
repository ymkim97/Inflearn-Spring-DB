package jdbc.connection;

import static jdbc.connection.ConnectionConst.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DBConnectionUtil {

	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			log.info("get Connection = {}, class = {}", connection, connection.getClass());
			return connection;
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}
