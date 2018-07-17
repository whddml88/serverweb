package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet{
	public void service(HttpServletRequest req,
						HttpServletResponse res) throws ServletException,IOException{
		//System.out.println("테스트");
		
		//처리를 위한 기본작업 - 한글설정, 응답객체로 부터 스트림을 얻기, 응답에 대한 타입을 설정
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//요청 정보출력
		String num1 = req.getParameter("num1");
		//int num1 = Integer.parseInt(num1);
		String method = req.getParameter("method");
		String num2 = req.getParameter("num2");
		
		System.out.println("입력1 :" + num1);
		System.out.println("연산자  :" + method);
		System.out.println("입력2 :" + num2);
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>계산결과</h1>");
		out.println("<h1>입력1 :" + num1+ "</h1>");
		out.println("<h1>연산자 :" + method + "</h1>");
		
		Calc obj = new Calc();
		int result = obj.calc(Integer.parseInt(num1), Integer.parseInt(num2), method);		
		
		out.println("<h1>입력2 :" + num2 + "</h1>");
		out.println("<h1>num1의 " + num1 + "과 num2의 " + num2 + "을 연산한"
				+ "결과는 " + result + "입니다 </h1></br>");
		out.println("</body>");
		out.println("</html>");
	}
}
