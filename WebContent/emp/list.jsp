<%@page import="emp.dto.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<h2>����ȭ��(list.jsp)</h2>
	<%
		ArrayList<EmpDTO> userlist = (ArrayList<EmpDTO>)request.getAttribute("userlist");	
	%>
	<%-- <h2><%=userlist %></h2> --%>
	<!-- 180712 �߰� -->
	<jsp:include page="search.jsp"/>
	<h1>������(jsp�κи�)</h1>
	<hr/>
	<table border = '1'>
		<tr bgcolor='skyblue'>
			<th>���̵�</th><th>����</th><th>�н�����</th>
			<th>�ּ�</th><th>�Ի���</th><th>���</th>
			<th>����Ʈ</th><th>�μ���ȣ</th><th>����</th>
			<%
				int size=userlist.size();
			for(int i=0; i<size; i++){
				EmpDTO user = userlist.get(i);%>
			<tr>
				<%-- <a href='/serverweb/emp/read.do?id=<%=user.getEmp_id()%>'></a> --%>
				<td><a href='/serverweb/emp/read.do?id=<%=user.getEmp_id()%>&action=READ'><%=user.getEmp_id()%></a></td>
				<td><%=user.getName()%></td>
				<td><%=user.getPass()%></td>
				<td><%=user.getAddr()%></td>
				<td><%=user.getHiredate()%></td>
				<td><%=user.getGrade()%></td>
				<td><%=user.getPoint()%></td>
				<td><%=user.getDeptNo()%></td>
				<td><a 
				href="/serverweb/emp/delete.do?id=<%=user.getEmp_id() %>">����</a></td>
				</tr>
				<%} %>	
	</table>
</body>
</html>