<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/insertemp" method="post">
		员工名称<input type="text" name="name"><br>
		员工年龄<input type="text" name="age"><br>
		员工性别<input type="text" name="sex"><br>
		员工地址<input type="text" name="address"><br>
		<input type="submit" value="提交">
	
	</form>
</body>
</html>