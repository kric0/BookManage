<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="dao.*"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>是否借阅</title>
</head>
<body>
<%
//@SuppressWarnings("unchecked")
//  List<Book> list = (List<Book>) session.getAttribute("list");
  String type = request.getParameter("type");
  request.setCharacterEncoding("UTF-8");

  if(type.equals("yes")){System.out.println("4444");
%><jsp:forward page="input_2.jsp"></jsp:forward>
<%}else{System.out.println("5555");
%><!-- 不借阅，则返回主页面 -->
<jsp:forward page="find.jsp"></jsp:forward>
<%}// request.setAttribute("list2", list1);%>
</body>
</html>