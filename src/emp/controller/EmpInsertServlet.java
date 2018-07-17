package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;
import emp.service.EmpServiceImpl;

public class EmpInsertServlet extends HttpServlet{
	public void service(HttpServletRequest req,
						HttpServletResponse res) throws ServletException, IOException{
		System.out.println("�׽�Ʈ");
		
		req.setCharacterEncoding("euc-kr");
		/*res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();*/
		
		String deptno = req.getParameter("deptno");
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String addr = req.getParameter("addr");
		String point = req.getParameter("point");
		String grade = req.getParameter("grade");
		
		
		//1. Ŭ���̾�Ʈ�� ��û���� ����
		System.out.println("deptno :" + deptno);
		System.out.println("name :" + name);
		System.out.println("id :" + id);
		System.out.println("pass :" + pass);
		System.out.println("addr :" + addr);
		System.out.println("pint :" + point);
		System.out.println("grade :" + grade);
		
		//2. �����Ͻ� �޼ҵ� ȣ��
		EmpDTO user = new EmpDTO(id, pass, name ,addr, grade, Integer.parseInt(point), deptno);
		
		EmpService service = new EmpServiceImpl();
		int result = service.insert(user);
		
		//3. ����ȭ�� ����
		//������ ����
		
		String msg = "";
		if(result >=1 ){
			msg = result+"�� �� ���� ����";
		}else{
			msg = "���Խ���";
		}
		
		//��û ������ - sendRedirect
		//
	/*	res.sendRedirect("/serverweb/basic/insertResult.html");*/
		
		//
		req.setAttribute("msg", msg);
		
		//
		RequestDispatcher rd = 
				req.getRequestDispatcher("/emp/InsertResult.jsp");
		rd.forward(req, res);
		
		/*out.println("<html>");
		out.println("<body>");
		out.println("<h1>" + msg +"</h1>");
		out.println("<h3 href='/serverweb/emp/list.do'>ȸ����Ϻ���</h3>");
		out.println("</body>");
		out.println("</html>");*/
		
	}
}
