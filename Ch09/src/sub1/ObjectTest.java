package sub1;

/*
 * ��¥ : 2021/05/25 
 * �̸� : ������
 * ���� : �ڹ� ����Ŭ����(�⺻ API Ŭ����) �ǽ��ϱ�
 * */


public class ObjectTest {
	
	public static void main(String[] args) {

		/*
		 * Object Ŭ����
		 * - �ڹ��� �ֻ��� Ŭ����
		 * - �ڹ��� ��� Ŭ������ Object Ŭ������ ��� �޴´�.
		 * - �������� Ȱ��
		 * */
		
		Object apple = new Apple("�ѱ�", 3000);
		Object banna = new Apple("�븸", 5000);
		
		apple.toString();
		banna.toString();
		
	}
}
