<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改页面</title>
</head>
<body>
	<mvc:form action="${ctx}/insert" method="POST" modelAttribute="account">
		账号名：<mvc:input path="username"/><br/>
		密码：<mvc:input path="password"/><br/>
		年龄：<mvc:input path="age"/><br/>
		<input type="submit" value="提交" />
	</mvc:form>
</body>
</html>