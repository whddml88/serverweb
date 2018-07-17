package db.util;
//����� �߰� �ۼ��κ�
//���� �ٲ�� �κ��� �������Ϸ� �з� �Ѵ�.

//sql�� ���Ŀ� XML���Ϸ� ���� �ɰ����� ����.
public class EmpQuery {
	public static final String EMP_INSERT
					= "insert into kitriemp values(?,?,?,?,sysdate,?,?,?)";
	public static final String EMP_LIST
					= "select * from kitriemp";
	public static final String EMP_DELETE
					= "delete kitriemp where id=?";
	public static final String EMP_READ 
					= "select * from kitriemp where id=?";
	
	public static final String EMP_SEARCH1	//column���� ?�� �ü� ����. ���������� �ʿ�.
											//?=? XXXXXX �ȵ�
						//***
					= "select * from kitriemp where name like ?";
	public static final String EMP_SEARCH2	
					= "select * from kitriemp where addr like ?";
	public static final String EMP_SEARCH3	
					= "select * from kitriemp where id like ?";
	
	public static final String EMP_UPDATE	
	= "update kitriemp set addr=?, grade=?, point=? where id like ?";
}
