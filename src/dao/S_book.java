package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javabean.DB;

public class S_book {
	
	private List<Book> list = new ArrayList<Book>();
    private DB db = new DB();
    private Connection conn = null;
    private PreparedStatement pstmt = null;

    public List<Book> b_type(String type,String num) throws Exception{
    	S_book s = new S_book();
    	String sql="select id,name,author,price,info from book where "+type+" like '%"+num+"%'";
		return s.query(sql);
    }
    
    public List<Book> query(String sql) throws Exception{
    	conn=db.getConn();
		pstmt=conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
			
//		System.out.println(rs.getRow());
		rs.last();
//		rs.beforeFirst();
		if(rs.getRow()!=0) {
			
			rs.beforeFirst();
			while(rs.next()) {
				String id=rs.getString("id");
			    String name1=rs.getString("name");
			    String author=rs.getString("author");
			    double price=rs.getDouble("price");
			    String info=rs.getString("info");
			    Book book = new Book(id,name1,author,price,info);
			    list.add(book);
			}
		}
		
		db.free(rs, pstmt, conn);

		return list;
    }
    
	
}
	
