package sub3;

/*
 * ��¥ : 2021/05/26
 * �̸� : ������
 * ���� : �ڹ� String ��� �׽�Ʈ
 * */

public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
		// length
		System.out.println("str ���ڿ� ���� : "+str.length());
		
		// charAt
		
		System.out.println("str 1��° ���� : " + str.charAt(0));
		System.out.println("str 7��° ���� : " + str.charAt(6));
		
		// substring
		System.out.println("str���� 0 ~ 5���� ���ڿ� : " + str.substring(0,5));
		System.out.println("str���� 6���� ���������� ���ڿ� : " + str.substring(6));
		
		
		// indexOf, lastIndexOf - ���ڿ����� Ư������ �ε��� ����
		System.out.println("str���� �տ��� ���� ���� e �ε��� : " + str.indexOf('e'));
		System.out.println("str���� �տ��� ���� ���� e �ε��� : " + str.lastIndexOf('e'));
		
		// replace
		System.out.println("str ���ڿ����� 'Korea'�� 'Busan'���� ��ü : " + str.replace("Korea", "Busan"));
		System.out.println("str ���ڿ����� 'Hello'�� 'Welcome'���� ��ü : " + str.replace("Hello", "Welcome"));
		
		// valueOf - �⺻Ÿ��
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = String.valueOf(var3);
		String s4 = "" + var3;
		
		
	}
}
