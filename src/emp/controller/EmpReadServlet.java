package emp.controller;

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

@WebServlet(name = "emp/read", urlPatterns = { "/emp/read.do" })
public class EmpReadServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,
						HttpServletResponse res) throws ServletException, IOException{
		System.out.println("�׽�Ʈ");
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//��û��������
		String id = req.getParameter("id");
		String action = req.getParameter("action");
		
		System.out.println("EmpReadServlet : "+action);
		
		//�����Ͻ� �޼ҵ� ȣ��
		EmpService service = new EmpServiceImpl();
		EmpDTO user = service.read(id);

		//������ ����
		req.setAttribute("user", user);
		
		//��û ������
		/*RequestDispatcher rd = 
				req.getRequestDispatcher("/emp/emp_read.jsp");*/
		RequestDispatcher rd = null;
		if(action.equals("READ")){
			rd = req.getRequestDispatcher("/emp/emp_read.jsp");
		}else{
			rd = req.getRequestDispatcher("/emp/emp_update.jsp");
		}
		//
		rd.forward(req, res);
		
	}
}
