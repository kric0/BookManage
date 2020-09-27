package javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
	public Connection getConn() throws Exception {
		String driverName="com.mysql.jdbc.Driver";
		String userName="root";
		String passWord="123456";
		String dbName="bookmanage";
		
		String url1="jdbc:mysql://localhost:3306/"+dbName;
		String url2="?user="+userName+"&password="+passWord;
		String url3="&useUnicode=true&characterEncoding=UTF-8";
		String url=url1+url2+url3;
		
		Class.forName(driverName);
		
		Connection conn=DriverManager.getConnection(url,userName,passWord);
		return conn;
	}
	
	public void free(ResultSet rs,PreparedStatement pstmt,Connection conn) throws SQLException {
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();
		
	}
}
