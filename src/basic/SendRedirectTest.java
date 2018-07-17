package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;

@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();

		System.out.println("sendRedirect���� - Redirect���� ������");
		out.print("<h1>��û������ ����- sendRedirect</h1>");
		
		//1. ������ ���� - db���� ������ ����� �����Ͻ����� ������
		
		EmpDTO dto = new EmpDTO("jang", "", "�嵿��", "", "", 0, "11");
		//��û�����ȿ��� "mydata"��� �̐j���� dto�� �����ɼ� �ֵ��� �����۾�
		request.setAttribute("mydata", dto);
		
		//2. ��û ������ - sendRedirect
		//���� ���Դ� �ٽ� �巯��
		response.sendRedirect("/serverweb/sevlettest/result.jsp");
		//ȭ����ȯ�� �ʿ��ѵ� ������ ������ �ʿ���ٸ� Ridirect�� ����ϸ� �ȴ�.
		
	}

}
