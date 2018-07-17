package db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	public static void main(String[] args){
		System.out.println(getConnect());
	}
	
	static {
		try {//1. JDBC����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // ������ �ٿ����� ã�� �ܰ躰 ������ ���
		}
	}
	//2. DB����
	//
	public static Connection getConnect(){
		Connection con = null;	//�ʱ�ȭ
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try{	//����̺� �ε�
			con = DriverManager.getConnection(url, user, password);
			//url�� user�� password �Է��ϸ� ����
		}catch(SQLException e){ //SQL Server���� ��� �Ǵ� ���� ��ȯ�Ҷ� throw�Ǵ� ����
			e.printStackTrace();
		}
		return con;
	}
	//�ڿ� �ݳ�
	public static void close(Connection con){
		try{
			if(con != null)	//������ null�� �ƴϸ�
				con.close();//�����.
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement ptmt){
		try{
			if(ptmt != null)
				ptmt.close();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
}
