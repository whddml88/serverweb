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
		System.out.println("테스트");
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//클라이언트 입력 요청 정보 출력
		
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String[] sw = req.getParameterValues("sw");
		
		System.out.println("이름 :" + name);
		System.out.println("주소 :" + addr);
		System.out.println("사용중인 소프트웨어");
	
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>출력결과</h1>");
		out.println("<h1>이름 :" + name + "</h1>");
		out.println("<h1>주소 :" + addr + "</h1>");
		out.println("<h1>사용중인 소프트웨어 :");
		
		for(int i=0; i<sw.length; i++){
			out.print(sw[i]+"<br/>");
		}
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
