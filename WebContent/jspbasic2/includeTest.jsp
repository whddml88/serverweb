<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>include �׽�Ʈ</h1>
	<hr/>
	<h2>include�׼��±״� ��û�������Ǵ� web application�� �������� ������ �ǵ��ƿ´�.</h2>
	<h1>===========include�׼��±� �׽�Ʈ ����===========</h1>
	<jsp:include page="/jspbasic2/actiontag_sub.jsp"></jsp:include>
	<jsp:param value="kim" name="id"/>
</body>
</html>