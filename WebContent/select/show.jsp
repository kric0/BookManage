<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="sec.*"
    import="dao.*"
    import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   String uname = (String)session.getAttribute("uname");
   S_info_sum sis = new S_info_sum();
   List<Info> list = new ArrayList<Info>();
   list = sis.s_sum(uname); 
   int n = 0;
%>
<table border="2" bgcolor="ccceee" width="650">
   <tr bgcolor="#E0FFFF" align="center">
     <td>记录条数</td><td>图书号</td><td>图书名</td><td>用户名</td><td>类型</td><td>借期</td><td>还期</td><td>超期</td><td>info</td>
   </tr>
<% 
   for(Info b : list){%>
	   <tr align="center">
	   <td><%=++n %></td>
       <td><%=b.getId() %></td>
       <td><%=b.getName() %></td>
       <td><%=b.getUname() %></td>
       <td><%=b.getType() %></td>
	   <td><%=b.getLenddate() %></td>
	   <td><%=b.getHuanqi() %></td>
	   <td><%=b.getCq() %></td>
	   <td><%=b.getInfo() %></td>
<!--  	   <td><%=b.getAppoint() %></td>       -->
	   
	   </tr>
   <% }System.out.println("3333");//request.setAttribute("list", list);
%></table>
</body>
</html>