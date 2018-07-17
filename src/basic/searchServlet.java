package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;
import emp.service.EmpServiceImpl;


@WebServlet(name = "emp/search", urlPatterns = { "/emp/search.do" })
public class searchServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, 
						HttpServletResponse res) throws ServletException, IOException{
		System.out.println("search ����");
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/hmtl; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//1. ��û���� ����
		//get�� ������ �������µ� �ѱ��� �״�� �������°Ϳ� ���� ������ �ȵǾ�����.
		//��ȯ�ؼ� �������ų� Server�� server.xml���� Connector �κ� URIEncoding �߰� �� ����
		String search = req.getParameter("search");
		String column = req.getParameter("column");
		String pass = req.getParameter("pass");
		System.out.println("�˻���:" + search);
		
		out.print("<h1>Search ����</h1>");
		
		//2. ����Ͻ� �޼ҵ� ȣ��
		EmpService service = new EmpServiceImpl();
		ArrayList<EmpDTO> userlist = service.Search(column, search, pass);
		
		//3. ���������� ����
		req.setAttribute("userlist", userlist);
		
		//4. ��û������
		RequestDispatcher rd =
				req.getRequestDispatcher("/emp/list.jsp");
		rd.forward(req, res);
		
		out.println("<h1>��û������ end</h1>");
		
	}
}
