<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加</title>
</head>
<body>
	<form action="add" method="post">
		用户编码；<input type="text" name="ucode"><br>
		用户名称：<input type="text" name="uname"><br>
		用户密码：<input type="password" name="password"><br>
		用户地址：<input type="text" name="uaddress"><br>
		用户角色：<input type="text" name="rid"><br>
		<input type="submit" value="添加">
	</form>
</body>
</html>