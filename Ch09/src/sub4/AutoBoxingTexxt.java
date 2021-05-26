package sub4;

/*
 * ��¥ : 2021/05/26
 * �̸� : ������
 * ���� : Wrapper Ŭ���� AutoBoxing �ǽ��ϱ�
 * */

public class AutoBoxingTexxt {

	public static void main(String[] args) {
		
		// Auto-boxing : �⺻Ÿ�� -> Wrapper
		Integer w1 = 1;
		Double w2 = 2.13;
		Boolean w3 = false;
	
		System.out.println("w1 : " + w1);
		System.out.println("w2 : " + w2);
		System.out.println("w3 : " + w3);
		
		// Auto-unboxing : Wrapper -> �⺻Ÿ��
		int var1 = w1;
		double var2 = w2;
		boolean var3 = w3;
		
	}
	
}
