package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public void service(HttpServletRequest req,
						HttpServletResponse res) throws ServletException, IOException{
		System.out.println("FirstServlet....");
		//마지막으로 서버가 찾을수 있도록(설정파일에 등록하는 작업)
		
	}

}
