package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void service(HttpServletRequest req, 
						HttpServletResponse res)throws ServletException, IOException{
		System.out.println("테스트");

		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//클라이언트 입력 요청 정보 추출해보자
		String userId = req.getParameter("userId");
		String userName = req.getParameter("userName");
		String passwd = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] item = req.getParameterValues("item");
		
		
		System.out.println("아이디 :" + userId);
		System.out.println("성명 :" + userName);
		System.out.println("패스워드 :" + passwd);
		System.out.println("성별 :" + gender);
		System.out.println("직장 :" + job);
		System.out.println("아이템 :" + item);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Customer</h1>");
		out.println("<h1>아이디:" + userId + "</h1>");
		out.println("<h1>성명 :" + userName + "</h1>");
		out.println("<h1>패스워드 :" + passwd + "</h1>");
		out.println("<h1>성별 :" + gender + "</h1>");
		out.println("<h1>job :" + job + "</h1>");
		
		//item범위
		out.println("<h1>Favorites :");
		for(int i=0; i<item.length; i++){
			out.print(item[i]);
		}
		out.println("</h1>");
		
		out.println("</body>");
		out.println("</html>");

	}

}
