<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="dao.*"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书显示</title>
</head>
<body>
<%
int n=0;
@SuppressWarnings("unchecked")
List<Book> list = (List<Book>) session.getAttribute("list");System.out.println("2222");
if(list.size()==0){%>
	   没有找到相关图书！
<%  }else{
%>

<table border="2" bgcolor="ccceee" width="650">
   <tr bgcolor="#E0FFFF" align="center">
     <td>记录条数</td><td>图书号</td><td>图书名</td><td>作者</td><td>价格</td><td>备注</td>
   </tr>
<% 
   for(Book b : list){%>
	   <tr align="center">
	   <td><%=++n %></td>
       <td><%=b.getId() %></td>
       <td><%=b.getName() %></td>
       <td><%=b.getAuthor() %></td>
       <td><%=b.getPrice() %></td>
       <td><%=b.getInfo() %></td>
	   
	   </tr>
   <% }System.out.println("3333");//request.setAttribute("list", list);
%></table>
<!-- 666666666666666666                 如果借阅            66666666666666666666666666666666666   -->
<form action="borrow/show_2.jsp" method="post">
 <p align="right">请输入要借书的书号:<input type="text" name="id"><br>
 <input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
  
</form>
   <%}%>
   <br>
   


<!--   
   <br>
 
   <form action="show_2.jsp" method="post">
     请输入要借书的书号:<input type="text" name="id"><br>
     <input type="submit" value="提交">
     
   </form>
       
               --> 
</body>
</html>