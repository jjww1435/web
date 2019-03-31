<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>用户名</th>
				<th>密码</th>
				<th>年龄</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="obj" varStatus="vs">
				<tr>
					<td>${obj.id}</td>
					<td>${obj.username}</td>
					<td>${obj.password}</td>
					<td>${obj.age}</td>
					<td><a
						href="${pageContext.request.contextPath}/xiugaiaccount/${obj.id}">修改账号</a></td>
					<td><a data-id="${obj.id}" class="del-btn"
						href="javascript:void(0)">删除账号</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="${ctx}/xinzengaccount">新增账号</a>
	<form id="form1" method="POST">
		<input type="hidden" name="_method" value="DELETE" />
	</form>
</body>
<script type="text/javascript" src="${ctx}/static/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('.del-btn').on('click', function() {
			var $this = $(this);
			var id = $this.attr('data-id');
			var url = "${ctx}/deleteaccount/" + id;
			$('#form1').attr('action', url);
			$('#form1').submit();
		});
	});
</script>
</html>