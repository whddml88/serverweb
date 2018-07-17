package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;
import emp.service.EmpServiceImpl;

public class EmpListServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,
						HttpServletResponse res) throws ServletException, IOException{
		System.out.println("�׽�Ʈ");
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		
		//�����Ͻ� �޼ҵ� ȣ��
		EmpService service = new EmpServiceImpl();
		ArrayList<EmpDTO> userlist = service.getMemberList();
		int size = userlist.size();
		
		
		//������ ����
		req.setAttribute("userlist", userlist);
		
		//��û ������
		RequestDispatcher rd = 
				req.getRequestDispatcher("/emp/list.jsp");
		//
		rd.forward(req, res);
		
		
		
		
		/*System.out.println("���� =-> "+ size);
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h1>������</h1>");
		out.println("<hr/>");
		
		out.println("<table border = '1'>");
		out.println("<tr bgColor='skyblue'>");
		
		out.println("<th>���̵�</th><th>����</th><th>�н�����</th>");
		out.println("<th>�ּ�</th><th>�Ի���</th><th>���</th>");
		out.println("<th>����Ʈ</th><th>�μ���ȣ</th><th>����</th>");
		out.println("</tr>");
		
		for (int i = 0; i < size; i++) {
			EmpDTO user = userlist.get(i);
			out.println("<tr>");
			out.println("<td>"+user.getEmp_id()+"</td>");
			out.println("<td>"+user.getName()+"</td>");
			out.println("<td>"+user.getPass()+"</td>");
			out.println("<td>"+user.getAddr()+"</td>");
			out.println("<td>"+user.getHiredate()+"</td>");
			out.println("<td>"+user.getGrade()+"</td>");
			out.println("<td>"+user.getPoint()+"</td>");
			out.println("<td>"+user.getDeptNo()+"</td>");
			out.println("<td><a href = '/serverweb/emp/"
					+ "delete.do?info=test&id="+user.getEmp_id()+"'>����</a></td>");
			//?�α����ϰ� ���� ����� �Ѵ�.'�� ��ġ Ȯ��
			out.println("</tr>");
			//404 �������� /������ ã�� ����
			//��κ� ������ ������ ����

		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");*/
		
	}
}
