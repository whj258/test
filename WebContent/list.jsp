<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
		<tr>
			<td>员工ID</td>
			<td>员工名称</td>
			<td>员工年龄</td>
			<td>员工性别</td>
			<td>员工地址</td>
			<td>操作</td>
			
		</tr>
		<c:forEach  items="${list }" var="lists">
				<tr>
					<td>${lists.id }</td>
					<td>${lists.name }</td>
					<td>${lists.age }</td>
					<td>${lists.sex }</td>
					<td>${lists.address }</td>
					<td><a href="deleteemp?empid=${lists.id }">删除</a></td>
					<td><a href="findemp?empid=${lists.id }">修改</a></td>
		<td><a href="addemp.jsp">添加</a></td>
				</tr>
		</c:forEach>
		
	</table>

</body>
</html>