package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;

@WebServlet(name = "forward", urlPatterns = { "/forward.do" })
public class ForwardTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();

		System.out.println("forward연습 - forward서블릿 실행중");
		out.print("<h1>요청재지정 연습- forward</h1>");
		
		//1. 데이터 공유 - db에서 가져온 결과나 비지니스로직 수행결과
		
		EmpDTO dto = new EmpDTO("jang", "", "장동건", "", "", 0, "11");
		//요청범위안에서 "mydata"라는 이릌으로 dto가 공유될수 있도록 공유작업
		request.setAttribute("mydata", dto);
		
		//2. 요청 재지정 - sendRedirect
		//서블릿이 요청되고 response된 않은 상태로 다시 jsp가 요청되는 것이므로 현재
		//context안에서 작업이 이루어진다. 따라서 context빼고 경로를 지정한다.
		RequestDispatcher rd = 
				//("")안에 context뺌
				request.getRequestDispatcher("/sevlettest/result.jsp");
		rd.forward(request, response);
		
		out.print("<h1>요청재지정연습-forward end</h1>");
		
	}

}
