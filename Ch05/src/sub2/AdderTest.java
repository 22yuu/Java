package sub2;

public class AdderTest {

	/*
	 * ��¥ : 2021/05/24
	 * �̸� : ������
	 * ���� : ��ü �޸� ���� �ǽ��ϱ�
	 * */
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		Adder a = new Adder(100);
		
		a.add(100);
		System.out.println("��ü a�� ��� ���� x : " + a.getX());

		a.add(a);
		System.out.println("��ü a�� ��� ���� x : " + a.getX());
		
		a.add(arr);
		System.out.println("��ü a�� ��� ���� x : " + arr[0]);
		
		a = a.addNew(a);
		System.err.println("��ü a�� ������� x : " + a.getX());
	}
}
