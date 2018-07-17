<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>forTest</h1>
	<hr/>
	<%-- <%for(int i=1; i<=10; i++){%>
		<h3>출력 :<%=i %></h3>
	<%} %> --%>
	<h1>guguTest</h1>
	<hr>
	<table border = 1>
	<%for(int i=2; i<10; i++){ %>
		<tr>
		<%for(int j=1; j<10; j++){ %>
		<td>
		<%=i + "*" + j + "=" + (i*j) %>
		</td>
		<%} %>
		</tr>
		<%} %>
		</table>
</body>
</html>