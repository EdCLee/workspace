<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ajax.*" errorPage="DBError.jsp"%>
<%
	String id = request.getParameter("id");
	MemberDao md = MemberDao.getInstance();
	int result = md.idChk(id);
	if (result == 1) {
%>
<%=id%>는 있는 ID니 다른 것 쓰시요
<p>
	<%
		} else {
	%>
	<%=id%>는 사용할 수 있습니다
	<%
		}
	%>