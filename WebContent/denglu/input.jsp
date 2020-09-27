<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../denglu" method="post">
  <table>
    <tr><td>用户名:</td><td><input type="text" name="uname"></td></tr>
    <tr><td>密码:</td><td><input type="text" name="password"></td></tr>
    <tr><td colspan="2">
      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="submit" value="提交">&nbsp;&nbsp;
      <input type="reset" value="取消">
  </table>
</form>
</body>
</html>