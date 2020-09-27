package dao;

import java.sql.*;

import javabean.DB;

public class I_info {
	private Connection conn;
	private DB db = new DB();
	private PreparedStatement pstmt = null;

	public int i_info(Info inf) throws Exception {
		String sql="insert into info (id,name,uname,type,lendate,huanqi,cq,info)values(?,?,?,?,?,?,?,?)";
		
		conn = db.getConn();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, inf.getId());
		pstmt.setString(2, inf.getName());
		pstmt.setString(3, inf.getUname());
		pstmt.setString(4, inf.getType());
		pstmt.setString(5, inf.getLenddate());
		pstmt.setString(6, inf.getHuanqi());
		pstmt.setString(7, inf.getCq());
		pstmt.setString(8, inf.getInfo());
		System.out.println("78rf");
		int n = pstmt.executeUpdate();
/*		String u = null;

		if(n==1)
			u="book表信息记录已更新";
		else
			u="book表更新操作失败";
		return u;
		
		insert into info (id,name,uname,type,lendate,huanqi,cq,info)values(1,1,1,1,1,1,1,1)
		insert into user values(root,123456);
*/
		return n;
	}

}
