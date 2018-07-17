package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;

@WebServlet(name = "forward", urlPatterns = { "/forward.do" })
public class ForwardTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();

		System.out.println("forward���� - forward���� ������");
		out.print("<h1>��û������ ����- forward</h1>");
		
		//1. ������ ���� - db���� ������ ����� �����Ͻ����� ������
		
		EmpDTO dto = new EmpDTO("jang", "", "�嵿��", "", "", 0, "11");
		//��û�����ȿ��� "mydata"��� �̐j���� dto�� �����ɼ� �ֵ��� �����۾�
		request.setAttribute("mydata", dto);
		
		//2. ��û ������ - sendRedirect
		//������ ��û�ǰ� response�� ���� ���·� �ٽ� jsp�� ��û�Ǵ� ���̹Ƿ� ����
		//context�ȿ��� �۾��� �̷������. ���� context���� ��θ� �����Ѵ�.
		RequestDispatcher rd = 
				//("")�ȿ� context��
				request.getRequestDispatcher("/sevlettest/result.jsp");
		rd.forward(request, response);
		
		out.print("<h1>��û����������-forward end</h1>");
		
	}

}
