<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>借书</title>
</head>
<body>
<form action="../borrow" method="post">
请输入你要借阅的图书信息:<br>
类型<input type="radio" name="type" checked="checked" value="id">图书号&nbsp;&nbsp;
    <input type="radio" name="type" value="name">图书名&nbsp;&nbsp;
    <input type="radio" name="type" value="author">图书作者<br>
图书<input type="text" name="num"><br><br><br>
<input type="submit" value="提交">
<br>
</form>

</body>
</html>