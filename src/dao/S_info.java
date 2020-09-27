package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javabean.DB;

public class S_info {
    private DB db = new DB();
    private Connection conn = null;
    private PreparedStatement pstmt = null;

    public int s_uname(String uname) throws Exception{
    	
    	String sql="select id,name,uname,type,lendate,huanqi,cq,info from info where uname=?";
    	
    	conn=db.getConn();
		pstmt=conn.prepareStatement(sql);
		
		pstmt.setString(1, uname);
		
		ResultSet rs = pstmt.executeQuery();
			
		int n = rs.getFetchSize();
		
		db.free(rs, pstmt, conn);

		return n;
    }

}
