package sub2;

import java.util.Iterator;

/*
 * ��¥ : 2021/05/17
 * �̸� : ������
 * ���� : �ڹ� switch �ǽ��ϱ�
 * */

public class ForTest {

	public static void main(String[] args) {
		
		// for
		for (int i = 1; i <=3; i++) {
			System.out.println("Hello Java!");
			System.out.printf("%d Hello Java! \n",i);
		}

		
		// 1���� 10���� ��
		int sum = 0;
		
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1���� 10���� ¦����
		sum = 0;
		
		for ( int i = 2; i <= 10; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
		
		// ��ø for
		
		// ������
		for ( int i = 2; i <= 9; i++) {
			System.out.println("***" + i + " �� *** ");
			for( int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
		
		// �� �ﰢ�� I
		for (int start = 1; start<=10; start++) {
			for (int end=1; end <= start; end++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �� �ﰢ�� II
		for(int a = 1; a<5; a++) {
			
			for(int b = 1; b<=5-a;b++) {
				System.out.print("��");
			}
			
			for(int c = 1; c<=a; c++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
}
