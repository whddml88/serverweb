<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>forward�׽�Ʈ</h1>
	<hr/>
	<h2>forward�� ��û���������� ���캻 RequestDispatcher�� forward�� �����ϰ�
		�����Ѵ�. forward�� ������ �Ķ���͵� �ѱ� �� �ִ�.
	</h2>
	<h2>/serverweb/list.do?id=jangó�� ��û�ϸ鼭 �Ķ���� �ѱ�°Ͱ� ������ �۾��̶� ����</h2>
	<jsp:forward page="/jspbasic2/actiontag_sub.jsp">
		<jsp:param value="jang" name="id"/>
	</jsp:forward>
	<h1>=======forward�׼��±� �׽�Ʈ ����===========</h1>
</body>
</html>