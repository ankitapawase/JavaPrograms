package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	static Connection connection;
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		if(connection == null ) {
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/january15","root","Ankita@2027");
			return connection;
			
		}
		else	
		{
			return connection;
		}
	}

}
