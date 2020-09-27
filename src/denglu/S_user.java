package denglu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javabean.DB;

public class S_user {
	
	private DB db = new DB();
    private Connection conn = null;
    @SuppressWarnings("unused")
	private PreparedStatement pstmt = null;

	public String s_guanli(String uname,String pass) throws Exception {
		  String mm = null;
	    	conn = db.getConn();
			String sql="select uname,password,info from user where uname='"+uname+"' and password='"+pass+"'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
/*			
			pstmt.setString(1, uname);
			pstmt.setString(2, pass);
*/			
			ResultSet rs = pstmt.executeQuery();
			
	    	rs.last();
			if(rs.getRow()==1) {
				if(rs.getString("info")==null) {
					mm = "您不是管理员"; 
				}
				else 
					mm = "登录成功";
			}
			else
				mm = "用户名或密码错误";
			db.free(rs, pstmt, conn);
			
            return mm;				    
	}
	
	public String s_yonghu(String uname,String pass) throws Exception {
		String mm = null;
    	conn = db.getConn();
		String sql="select uname,password,info from user where uname=? and password=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uname);
		pstmt.setString(2, pass);
		ResultSet rs = pstmt.executeQuery();
		rs.last();
		System.out.println(rs.getString("info"));
		if(rs.getRow()==1) {
			if(rs.getString("info")==null) {
				mm = "登录成功";
			}
			else 
				mm = "管理员不可登录"; 
		}
		else
			mm = "用户名或密码错误";
		db.free(rs, pstmt, conn);
        return mm;	
	}

}
