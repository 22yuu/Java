package sub1;

/*
 * ��¥ : 2021/05/20
 * �̸� : ������
 * ���� : �ڹ� �޼���(�Լ�) �ǽ��ϱ�
 * */


public class MethodTest {

	public static void main(String[] args) {
			
		
		// �޼��� ȣ��
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
	}
	
	// �޼��� ����
	public static int f(int x) {
		
		int y = 2 * x + 3;
		return y;
	}
}
