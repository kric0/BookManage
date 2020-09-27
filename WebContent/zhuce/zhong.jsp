<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="zcc.*"
    import="dao.User"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String uname = request.getParameter("uname");
String pass = request.getParameter("password");
String qrmm = request.getParameter("qrmm");
if(pass.equals(qrmm)) {
S_user_uname su = new S_user_uname();
int cm;
try {
	cm = su.s_uname(uname);
	if(cm==1) {
		//返回输入页，说明：该用户名已被使用???
	%>	<jsp:forward page="regist.jsp"></jsp:forward>
	<% }
	if(cm==0) {
		User user = new User(uname,pass,null);
//		HttpSession session = request.getSession();
		session.setAttribute("user",user);
		%>
		<jsp:forward page="show.jsp"></jsp:forward>
		<%
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
else
{
	//返回上一页，提示两次密码不一致????
	%>	<jsp:forward page="regist.jsp"></jsp:forward>
	<%
}
%>
</body>
</html>