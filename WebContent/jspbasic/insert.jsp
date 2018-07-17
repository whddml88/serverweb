<%@page import="emp.service.EmpServiceImpl"%>
<%@page import="emp.service.EmpService"%>
<%@page import="emp.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import = "emp.dto.*, db.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");

	
		String deptno = request.getParameter("deptno");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("addr");
		String point = request.getParameter("point");
		String grade = request.getParameter("grade");

		
		EmpDTO user = new EmpDTO(id, pass, name ,addr, 
				grade, Integer.parseInt(point), deptno);
		EmpService service = new EmpServiceImpl();
		
		int result=service.insert(user); %>
		<% if(result<0) {%>
			<h3>삽입실패</h3>
			<%} else{ %>
				<h3><%=result %>개 행삽입성공	</h3>
				<%} %>
	<h3>부서코드 : <%=deptno %></h3>
</body>
</html>