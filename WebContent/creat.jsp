<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javabean.DB"
    import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  DB db = new DB();
  Connection conn = db.getConn();
  String sql = "create table u3(type varchar(255),time  date)";
  PreparedStatement pstmt = conn.prepareStatement(sql);
  request.setCharacterEncoding("UTF-8");
  int b = pstmt.executeUpdate();
  if(b==1){%>创建成功
	  
  <% }
  else{%>创建失败
	  
  <% }%>
	 <%=b %>
  <%
    db.free(null,pstmt,conn);
  %>  

</body>
</html>