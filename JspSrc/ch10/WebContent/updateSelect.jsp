<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*,java.util.*,ch10.*"
	errorPage="DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "select * from dept";
		List<Dept> list = new ArrayList<>();
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Dept d = new Dept();
			d.setDeptno(rs.getInt(1));
			d.setDname(rs.getString(2));
			d.setLoc(rs.getString(3));
			list.add(d);
		}
		rs.close();
		stmt.close();
		conn.close();
		request.setAttribute("list", list);
	%>
	<jsp:forward page="oraDeptList.jsp"></jsp:forward>
</body>
</html>