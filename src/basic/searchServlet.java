package basic;

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


@WebServlet(name = "emp/search", urlPatterns = { "/emp/search.do" })
public class searchServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, 
						HttpServletResponse res) throws ServletException, IOException{
		System.out.println("search 연습");
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/hmtl; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//1. 요청정보 추출
		//get은 정보를 가져오는데 한글을 그대로 가져오는것에 대한 셋팅이 안되어있음.
		//변환해서 가져오거나 Server의 server.xml에서 Connector 부분 URIEncoding 추가 및 수정
		String search = req.getParameter("search");
		String column = req.getParameter("column");
		String pass = req.getParameter("pass");
		System.out.println("검색어:" + search);
		
		out.print("<h1>Search 연습</h1>");
		
		//2. 비즈니스 메소드 호출
		EmpService service = new EmpServiceImpl();
		ArrayList<EmpDTO> userlist = service.Search(column, search, pass);
		
		//3. 데이터정보 공유
		req.setAttribute("userlist", userlist);
		
		//4. 요청재지정
		RequestDispatcher rd =
				req.getRequestDispatcher("/emp/list.jsp");
		rd.forward(req, res);
		
		out.println("<h1>요청재지정 end</h1>");
		
	}
}
