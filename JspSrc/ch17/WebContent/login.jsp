<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		if (id.equals("kk") && pass.equals("1234")) {
			session.setAttribute("id", id);
			response.sendRedirect("sub3/winner.jsp");
		} else {
	%>
	<script type="text/javascript">
		alert("똑바로 해");
		history.go(-1);
	</script>
	<%
		}
	%>
</body>
</html>