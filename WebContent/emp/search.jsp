<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2> ��� �˻� </h2>
	<!-- ������ �����ö��� get -->
	<form method = "get" 
		action = "/serverweb/emp/search.do">
		<select name="column">
			<option >�˻��� �׸� ����
			<option value="id">���̵�
			<option value="name">����
			<option value="addr">�ּ�
			
		</select>
		<input type = "text" name = "search"/>
		<!-- <input type = "text" name = "pass"/> -->
		<input type='submit' value='�˻�'> 
	</form>
</body>
</html>