package zcc;

import java.sql.*;

import dao.User;
import javabean.DB;

public class I_user {
	private DB db = new DB();
	private Connection conn;
	private PreparedStatement pstmt;
	
	public int I_u(User user) throws Exception {
		String sql = "insert into user values(?,?,?)";
		conn = db.getConn();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUname());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getInfo());
		int n = pstmt.executeUpdate();
		return n;
		
	}

	User user;

}
