package emp.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpServiceImpl;

@WebServlet(name = "emp/search", urlPatterns = { "/emp/search.do" })

public class EmpSearchServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("EmpSearchServlet ���� ����");
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		
		//1. ��û���� ����
		String column = req.getParameter("column");
		String search = req.getParameter("search");
		String pass = req.getParameter("pass");
		System.out.println("�˻��� : "+search);
		System.out.println(column);
		System.out.println(search);
		
		//2.�����Ͻ� �޼ҵ� ȣ��
		EmpServiceImpl service = new EmpServiceImpl();
		ArrayList<EmpDTO> userlist = service.Search(column, search, pass);
		
		//3.������ ����
		req.setAttribute("userlist", userlist );
		
		//4.��û������
		RequestDispatcher rd = req.getRequestDispatcher("/emp/list.jsp");
		rd.forward(req, res);
	}
}