<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   String n = (String)request.getAttribute("reult");
 System.out.println(n);
   if(n.equals("登录成功")){
String ms =  "欢迎"+session.getAttribute("uname")+"登录！";
request.setAttribute("ms", ms);

//跳转到管理员主页面

   %>
  
   <%}
   else{ %>
   <%=n %>
   <%} %>
</body>
</html>