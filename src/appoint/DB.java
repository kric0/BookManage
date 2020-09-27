package appoint;

import java.sql.*;
import java.sql.DriverManager;

import com.mysql.cj.protocol.Resultset;

public class DB {
	public Connection getConn() throws Exception {
		String driverName = "com.jdbc.mysql.Driver";
		String userName = "root";
		String password = "123456";
		String dbName = "bookmanage";
		String url1 = "jdbc:mysql://localhost:3306/"+dbName;
		String url2 = "?user="+userName+"&password="+password;
		String url3 = "&userUnicode=true&characterEncoding=UTF-8";
		String url = url1+url2+url3;
		Class.forName(driverName);
		Connection conn = DriverManager.getConnection(url);
		return conn;
	}
	public void free(Resultset rs,PreparedStatement pstmt,Connection conn) {
		
	}

}
