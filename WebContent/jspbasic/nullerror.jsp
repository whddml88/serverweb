<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
      <%
    	//오류상황에 현재페이지를 응답해서 결과로 출력해양 하므로 200코드를 설정해서 정상상황을 셋팅
    	response.setStatus(HttpServletResponse.SC_OK);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body bgcolor = "pink">
	<img alt="" src="/serverweb/images/jang.jpg"/>
	<hr/>
	<h2>현재 서버작업중</h2>
	<h3>11:00 ~ 12:00</h3>
</body>
</html>