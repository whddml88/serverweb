<%@page import="emp.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<% 
		EmpDTO user = (EmpDTO) request.getAttribute("user");
%>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
		action="/serverweb/emp/update.do" 
		method="post">
				<fieldset>
					<div id="legend">
						<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
					</div>
					<div class="form-group">
						<!-- �μ��ڵ� -->
						<label class="control-label col-sm-2" for="deptcode">�μ��ڵ�</label>
						<div class="col-sm-3">
							<%=user.getDeptNo() %><!-- read only -->
						</div>
					</div>

					<div class="form-group">
						<!-- �μ���-->
						<label class="control-label col-sm-2" for="name">����</label>
						<div class="col-sm-3">
							<!-- ������ �̰��� ����ϼ��� -->
							<%= user.getName() %>
						</div>
					</div>
					
					<div class="form-group">
						<!-- ���̵�-->
						<label class="control-label col-sm-2" for="id">���̵�</label>
						<div class="col-sm-3">
							<!-- ���̵� �̰��� ����ϼ��� -->
							<%= user.getEmp_id() %>
							<input type="hidden" name="id" value="<%= user.getEmp_id() %>"/>
						</div>
					</div>
					<div class="form-group">
						<!-- �ּ�-->
						<label class="control-label col-sm-2" for="addr">�ּ�</label>
						<div class="col-sm-3">
							<!-- �ּҸ� �̰��� ����ϼ��� -->
							<input type="text" value="<%= user.getAddr() %>" name="addr"/>
						</div>
					</div>

					<div class="form-group">
						<!-- �Ի糯¥-->
						<label class="control-label col-sm-2" for="hiredate">�Ի糯¥</label>
						<div class="col-sm-3">
							<!-- �Ի糯¥�� �̰��� ����ϼ��� -->
							<%= user.getHiredate() %>
						</div>
					</div>
					<div class="form-group">
						<!-- ����Ʈ-->
						<label class="control-label col-sm-2" for="point">����Ʈ</label>
						<div class="col-sm-3">
							<!-- ����Ʈ�� �̰��� ����ϼ��� -->
							<input type="text" 
							value="<%= user.getPoint() %>" name="point"/>
			
						</div>
					</div>
					<div class="form-group">
						<!-- ���-->
						<label class="control-label col-sm-2" for="grade">���</label>
						<div class="col-sm-3">
							<!-- ����� �̰��� ����ϼ��� -->
							<input type="text" 
							value="<%= user.getGrade() %>" name="grade"/>
							
						</div>
					</div>
					<div class="form-group">
						<!-- Button -->
						<!-- ������Ʈ�� �����۾����� ��۾����� ���е� �ؾ� ��. -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="�Ϸ�"
							 class="btn btn-success" />
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>