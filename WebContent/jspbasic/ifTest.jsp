<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%String str = "java";
		int size =str.length();
	%>
	<h1>��ũ��Ʈ ���(��ũ��Ʈ���� ǥ������ ���� ���)</h1>
	<%if(size>=5){%>
		<h1>���ƿ�:<%=size %></h1>
		<%}else{ %>
			<h1>�Ⱦ��:<%=size %></h1>
	<%} %>
</body>
</html>