<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
		request.setCharacterEncoding("euc-kr");
	
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
		
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] item = request.getParameterValues("item");
	%>
	<h3>���̵� : <%=userId %></h3>
	<h3>�̸� : <%=userName %></h3>
	<h3>�н����� : <%=passwd %></h3>
	<h3>���� : <%=gender %></h3>
	<h3>���� : <%=job %></h3>
	<h3></h3>
	<%for(int i=0; i<item.length; i++){ %>
		<%=item[i] %>
		<%} %>
		</h3>
</body>
</html>