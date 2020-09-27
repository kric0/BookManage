package sec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.Info;
import javabean.DB;
import javabean.Date_d;

public class S_info_sum {
	
	    private DB db = new DB();
	    private Connection conn = null;
	    private PreparedStatement pstmt = null;
	    private List<Info> list = new ArrayList<Info>();
	    
	    public List<Info> s_sum(String uname) throws Exception{
	    	Date_d chaq = new Date_d();
	    	
	    	String sql="select id,name,uname,type,lendate,huanqi,cq,info from info where uname=?";
	    	
	    	conn=db.getConn();
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, uname);
			
			ResultSet rs = pstmt.executeQuery();
			rs.last();
				System.out.println(rs.getRow());
				 String c= chaq.chaoq("2017-2-9");
				    System.out.println("*"+c);
			if(rs.getRow()!=0) {
				
				rs.beforeFirst();
				while(rs.next()) {
					String id=rs.getString("id");
				    String name1=rs.getString("name");
				    String uname1=rs.getString("uname");
				    String type=rs.getString("type");
				    String lendate=rs.getString("lendate");
				    String huanqi=rs.getString("huanqi");
				    String cq= chaq.chaoq(huanqi);System.out.println("***"+cq);
				    String info=rs.getString("info");
				    Info inf= new Info(id,name1,uname1,type,lendate,huanqi,cq,info,null);
				    list.add(inf);
				}
			
			db.free(rs, pstmt, conn);
			}
			return list;
	    }

}
