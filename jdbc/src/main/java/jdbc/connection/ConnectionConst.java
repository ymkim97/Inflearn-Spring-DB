package jdbc.connection;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class ConnectionConst {

	public static final String URL = "jdbc:h2:tcp://localhost/~/test";
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "";
}
