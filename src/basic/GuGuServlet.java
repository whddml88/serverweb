package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuGuServlet extends HttpServlet{
	public void service(HttpServletRequest req,
						HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println("hihi");
		int num = 7;
		for(int i=1; i<10; i++){
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}