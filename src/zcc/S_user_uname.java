package zcc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javabean.DB;

public class S_user_uname {
	private DB db = new DB();
    private Connection conn = null;
    @SuppressWarnings("unused")
	private PreparedStatement pstmt = null;

	public int s_uname(String uname) throws Exception {
	    	conn = db.getConn();
			String sql="select uname,password,info from user where uname='"+uname+"'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
/*			
			pstmt.setString(1, uname);
			pstmt.setString(2, pass);
*/			
			ResultSet rs = pstmt.executeQuery();
			
	    	rs.last();
	    	int row = rs.getRow();
	    	db.free(rs, pstmt, conn);
            return row;				    
	}
	

}
