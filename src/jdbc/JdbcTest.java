package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws SQLException {
		
		Connection con;
		Statement stmt;
		ResultSet result;
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@oracdbdevrk1p:1521:SRVAESQA", "AES_RGS_PB", "Aes^!44Rgrs");
		stmt = con.createStatement();
		result = stmt.executeQuery("select * from aes_seasons");
		
		while (result.next()) {
			System.out.println(result.getString(1));
		}
		
		con.close();
	}

}
