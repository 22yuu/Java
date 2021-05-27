package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * ��¥ : 2021/05/27
 * �̸� : ������
 * ���� : �ڹ� �����ͺ��̽� ���α׷��� �ǽ��ϱ�
 * */

public class SelectTest {

	
	public static void main(String[] args) {
			// DB����
			String host = "jdbc:mysql://192.168.10.114:3306/22jinuu";
			String user = "22jinuu";
			String pass = "1234";
					
			try {
				
				// 1�ܰ� - JDBC ����̹� �ε�
				Class.forName("com.mysql.jdbc.Driver");
				
				// 2�ܰ� - �����ͺ��̽� ����
				Connection conn = DriverManager.getConnection(host, user, pass);
				
				// 3�ܰ� - SQL ���ఴü ����
				Statement stmt = conn.createStatement();
				
				// 4�ܰ� - SQL ����
				String sql = "SELECT * FROM `USER1`";
				ResultSet rs = stmt.executeQuery(sql);
				
				// 5�ܰ� - ����� ó��(SELECT�� ���)
				while(rs.next()) {
					System.out.println(rs.getString(1));
					String uid  = rs.getString(1);
					String name = rs.getString(2);
					String hp   = rs.getString(3);
					int    age  = rs.getInt(4);
					
					System.out.println("=========================");
					System.out.println("���̵� : " + uid);
					System.out.println("�̸� : " + name);
					System.out.println("�޴��� : " + hp);
					System.out.println("���� : " + age);
					System.out.println("=========================");
				}
				
				// 6�ܰ� - �����ͺ��̽� ����
				conn.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("���α׷� ����");
	}
	
}
