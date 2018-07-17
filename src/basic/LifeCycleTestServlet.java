package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTestServlet extends HttpServlet{
	public LifeCycleTestServlet(){
		System.out.println("LifeCycleTestServlet��ü ����..");
	}
	public void init(){
		System.out.println("init() ȣ��");
	}
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		System.out.println("service()ȣ��^^..." + req.getMethod());
		//get������� ��û�� ������ doGet���� ȣ���ϰ� post����̸� doPost�� ȣ��
		//��û����� get���� post���� �˾ƾ� �Ѵ�.
		
		if(req.getMethod().equals("GET")){
			doGet(req, res);
		}else{
			doPost(req, res);
		}
	}
	
	protected void doGet(HttpServletRequest req,
	         HttpServletResponse resp)
	              throws ServletException,
	                     java.io.IOException{
		System.out.println("doGet()ȣ��");
	}
	protected void doPost(HttpServletRequest req,
	         HttpServletResponse resp)
	              throws ServletException,
	                     java.io.IOException{	//sysout�� �ִ�.
		System.out.println("doPost()ȣ��");
	}	                                
	public void destroy(){ //callback�޼ҵ�
		//������ü�� �Ҹ�ɶ� ȣ��Ǵ� �޼ҵ�
		//- WAS�� ���ε�, ������ ����Ǿ�����, Context�� ���ε�
		System.out.println("destroy()ȣ��...");
	}
}
