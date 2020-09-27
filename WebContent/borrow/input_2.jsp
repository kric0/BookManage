<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="dao.*"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
@SuppressWarnings("unchecked")
   List<Book> list = (List<Book>) session.getAttribute("list");
System.out.println("6666");
   if(list.size()==1){System.out.println("7777");
	   String id = list.get(0).getId();
	   request.setAttribute("id", id);
	   %>
	   <jsp:forward page="show_2.jsp"></jsp:forward>
	   <%
}
else{System.out.println("8888");%>
<form action="show_2.jsp" method="post">
  请输入要借书的书号:<input type="text" name="id"><br>
  <input type="submit" value="提交">
  
</form>
<%}
%>
</body>
</html>