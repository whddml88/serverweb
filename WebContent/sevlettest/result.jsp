<%@page import="emp.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>��û���������� ���û�Ǿ� ����Ǵ� JSP���� - ������ �������� ������ ������ ���</h1>
	<hr/>
	<%
		//������ �������� �����͸� ������ ����ϱ�
		//Ÿ���� object�� ������ � �����͵� ������ �ֵ��� 
		EmpDTO data = (EmpDTO)request.getAttribute("mydata");
	%>	
	<h3>������ ����ڸ� :<%= data.getName() %></h3>
	
	
</body>
</html>