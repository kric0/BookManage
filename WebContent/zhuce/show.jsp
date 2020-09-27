<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="dao.*"
    import="zcc.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   User user = (User)session.getAttribute("user");
   I_user ii = new I_user();
   int ni = ii.I_u(user);
   if(ni==1){%>
	   注册成功，请前去登录！
  <%  }
   else{%>
	   注册失败，出现异常错误！
   <%}
%>
</body>
</html>