package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javabean.DB;

public class B_book {
	public List<Book> b_book(String name) throws Exception{
		List<Book> list = new ArrayList<Book>();
		
//		int n;
//		String m = null;
		String sql="select id,name,author,price,info from book where name like '%"+name+"%'";
		System.out.println(sql);
		DB db = new DB();
		Connection conn = db.getConn();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		
		System.out.println(rs.getRow());
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
		else
		{
			return list;
		}
		db.free(rs, pstmt, conn);
//		rs.last();
		return list;
/*
		if(rs.getRow()!=0){
			String p = rs.getString("info");
			if(p=="可借") {
				
				String i=rs.getString("id");
				String f="预约";
			    String sql2="update book set info=? wherw id=?";
			    pstmt = conn.prepareStatement(sql2);
			    
			    pstmt.setString(1, i);
			    pstmt.setString(2, f);
			    
			    n = pstmt.executeUpdate();
			    
			    if(n==1)  m="借书成功";
			    else m="借书失败";
			}
			else {
				m="借书失败，图书已借出，只可预约";
			}
		}
		else
			m="错误";
		
		db.free(rs, pstmt, conn);
		
		return m;
*/
	}
	

}
