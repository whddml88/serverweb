package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Ŭ���̾�Ʈ�� ����±׿� �Է��� �����͸� ����
//post������� 
public class ParamTestServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, 
					HttpServletResponse res)throws ServletException, IOException{
		System.out.println("�׽�Ʈ ");//�������Ҷ� �����ϴ°� �߿�. ����Ǵ��� �޽��� �����鼭 �׽�Ʈ
		//��û������ �ѱ� ����
		req.setCharacterEncoding("EUC-KR");
		//���������� ���� Ÿ�԰� ���ڼ��� ����
		res.setContentType("text/html;charset=euc-kr");
		//���������� Ŭ���̾�Ʈ�� ����ϱ� ���ؼ� ��Ʈ����ü�� ����
		PrintWriter out = res.getWriter();
		
		//Ŭ���̾�Ʈ�� �Է��� ��û ������ �����ϱ�
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		System.out.println("���̵�:"+id);
		System.out.println("�н����� :" + pass);	//��û�� ����� get����ε� ��û�� �°� �޼ҵ带 ������ �Ѵ�.
												//405���� �޽����� ���\\\\\
		
		//Ŭ���̾�Ʈ�� ������ ȭ���� ����
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>���̵�:" + id + "</h1>");
		out.println("<h1>�н�����:" + pass + "</h1>");
		out.println("</body>");
		out.println("</html>");

	}
}
