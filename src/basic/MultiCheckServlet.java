package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiCheckServlet extends HttpServlet{
	public void service(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException{
		System.out.println("�׽�Ʈ");
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//Ŭ���̾�Ʈ �Է� ��û ���� ���
		
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String[] sw = req.getParameterValues("sw");
		
		System.out.println("�̸� :" + name);
		System.out.println("�ּ� :" + addr);
		System.out.println("������� ����Ʈ����");
	
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>��°��</h1>");
		out.println("<h1>�̸� :" + name + "</h1>");
		out.println("<h1>�ּ� :" + addr + "</h1>");
		out.println("<h1>������� ����Ʈ���� :");
		
		for(int i=0; i<sw.length; i++){
			out.print(sw[i]+"<br/>");
		}
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
