<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	function check(){
	if(document.getElementById("password").value!=document.getElementById("qrmm").value)
	{document.getElementById("warning").innerHTML="两次密码的输入不一致";
	}else {document.getElementById("warning").innerHTML=" ";
	}
	}</script>
<style type="text/css">
body 
{
background-image:url("image/bg3.jpg");
background-size:100% 100%;
background-repeat:no-repeat;
background-attachment:fixed;
}
  table
  {
  width:25%;
  background-color:white;
  border:5px solid #DEDEDE;
  align:centre;
  vertical-align: middle;
    font-family:宋体;
      font-size:30px;
  }
  h3
{
text-shadow: 5px 5px 5px #DEDEDE;
}
h1{position:absolute;left:200px;top:400px;text-shadow: 5px 5px 5px white;}
#warning{position:absolute;color:red;font-size:1px;font-weight:normal;font-style:normal;text-decoration:none;}
</style>
  </head>
  
  <body>  <p><br><br></p>
  <div align="center">
  <h3><font color="white" size=12px>用户注册</font></h3>
  <form action="zhuce/zhong.jsp" method="post">
<table align="center">
<tr><th>用 户 名<font color="red" size=5px>*</font></th><td><input type="text" name="uname"></td></tr>
<tr><th>密&nbsp;&nbsp;码<font color="red" size=5px>*</font></th><td><input type="password" name="password" id="password"></td></tr>
<tr><th>确认密码<font color="red" size=5px>*</font></th><td><input type="password" name="qrmm" id="qrmm" onblur="check()"></td></tr>
<tr><td align="center" rowspan="2" height=40px><input type="submit" value="注   册"></td><td><span id="warning"></span></td></tr>
<tr><td><font size=1px><a href="login.jsp">已有账号？点这里直接登陆</a></font></td></tr>
</table></form>
</div>
<h1>立身以立学为先，立学以读书为本。 —— 朱熹</h1>
  </body>
</html>
