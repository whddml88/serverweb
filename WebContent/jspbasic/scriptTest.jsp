
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList,java.util.Date" %>
<%@page import="java.util.StringTokenizer" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="emp.dto.EmpDTO,java.util.Random"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>4. ���� - jsp �������� �������, ����޼ҵ带 �����ϱ� ���ؼ� ���(���� ������)</h3>
	<%int num = 1000; %>
	<%! int num = 100; %>
	<%! public void test(){
		System.out.println("text");
	}
	%>
	
	<h3>3. ǥ���� - jsp�� �������� ��ȯ�ɶ� out.print()���ο� �����Ǵ� �ڵ�</h3>
	<h4>===> ǥ�������� �����ϴ� �����ʹ� out.print()�� �Ű������� ���޵ȴ�.
		���� ǥ�������� �����Ҷ��� ; �� �߰����� �ʴ´�. ;�� �߰��ϴ°��� print(��;)�� ������ ����� �ȴ�.
		ǥ������ �ڹٿ��� ����Ǵ� ���� ���������� ����� �������� ����ϴ� jsp��ũ��Ʈ ����̸�
		��밡���� Ÿ���� ������. Ÿ���� �������� ������ �������� ��ȯ�ɶ� print�޼ҵ��� �Ű�������
		���޵ǹǷ�...�⺻��, ��Ʈ������ ��ȯ�� �� �ִ� ������ ��, �޼ҵ��� ȣ���� ����� ���� ����Ҽ� �ִ�.
	</h4>
	<% String mydata = "java program";%>
	
	<h3>ǥ�������� �ۼ��ϴ� ���ڿ��� ���� : <%= mydata.length() %></h3>
	<h5><%= 10 %></h5>
	<h5><%= 10.5 %></h5>
	<h5><%= "java" %></h5>
	<h5><%= 10/4 %></h5>
	<h5><%= new Date().toString() %></h5>
	<h5><%= mydata %></h5>
	<h5><%= mydata.charAt(1) %></h5>
	

	<h3>2. ��ũ��Ʈ�� - �ڹ��ڵ带 ���� �ִ� ��ũ��Ʈ ���</h3>
	<%
		//�ڹ� ��ɹ��� ������ �� �ִ°� ;�� ������ ���� �߰��ؾ� ����.
		//�⺻���� �ν��ϴ� ��Ű���� java.lang��Ű���ۿ� ����. �ٸ� ��Ű���� ����ϴ� ���
		//import�ؾ� �Ѵ�. jsp���� �ڵ����� ��������� ���������� ��� �� �� �ִ�.
		String str = new String("�ڹ�");
		out.println("<h3>���ڿ��� ����" + str.length() + "</h3>");
		Random rand = null;
		ArrayList list = null;
		StringTokenizer st = null;
		EmpDTO user = null;
	%>
	<h3>1. �ּ���</h3>
	<!-- html�ּ���(Ŭ���̾�Ʈ�� ����) -->
	<%--jsp �ּ���(jsp�ڵ带 �ּ����� ó���ϴ� �뵵 : Ŭ���̾�Ʈ�� ���۵��� �ʴ´�.) --%>
	<%
		//�ڹ��ּ���
		/*
		�ڹ� ������ �ּ���
		*/
	%>
	
</body>
</html>