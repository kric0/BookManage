package dao;

import java.sql.*;

import javabean.DB;

public class U_book {
	private Connection conn;
	private DB db = new DB();
	private PreparedStatement pstmt = null;

	public int u_info(String id) throws Exception {
		String yy="预约";
		String sql="update book set info=? where id="+id;
		
		conn = db.getConn();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, yy);
		
		int n = pstmt.executeUpdate();
		System.out.println(n);
/*		String u = null;

		if(n==1)
			u="book表信息记录已更新";
		else
			u="book表更新操作失败";
		return u;
*/
		return n;
	}

}
