package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet{
	public void service(HttpServletRequest req,
						HttpServletResponse res) throws ServletException,IOException{
		//System.out.println("�׽�Ʈ");
		
		//ó���� ���� �⺻�۾� - �ѱۼ���, ���䰴ü�� ���� ��Ʈ���� ���, ���信 ���� Ÿ���� ����
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//��û �������
		String num1 = req.getParameter("num1");
		//int num1 = Integer.parseInt(num1);
		String method = req.getParameter("method");
		String num2 = req.getParameter("num2");
		
		System.out.println("�Է�1 :" + num1);
		System.out.println("������  :" + method);
		System.out.println("�Է�2 :" + num2);
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>�����</h1>");
		out.println("<h1>�Է�1 :" + num1+ "</h1>");
		out.println("<h1>������ :" + method + "</h1>");
		
		Calc obj = new Calc();
		int result = obj.calc(Integer.parseInt(num1), Integer.parseInt(num2), method);		
		
		out.println("<h1>�Է�2 :" + num2 + "</h1>");
		out.println("<h1>num1�� " + num1 + "�� num2�� " + num2 + "�� ������"
				+ "����� " + result + "�Դϴ� </h1></br>");
		out.println("</body>");
		out.println("</html>");
	}
}
