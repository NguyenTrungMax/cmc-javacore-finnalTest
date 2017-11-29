package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class ConnectionDB {
	/**
	 * @Parameter: No
	 * @Return: con
	 * @description: connect to database
	 * @modifier:
	 */
	public static Connection connectDb() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=Candidate;user=sa;password=123456";
			Connection con = DriverManager.getConnection(dbUrl);
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
