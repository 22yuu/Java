package sub1;

import java.util.Scanner;

/*
 * ��¥ : 2021/05/17
 * �̸� : ������
 * ���� : �ڹ� if ���ǹ� �ǽ��ϱ�
 * */


public class IfTest {

	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		}
		
		if (num1 > 0) {
			
			if(num2 > 1) {
				System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��.");
			}
		}
		
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��.");
		}
		
		// if ~ else
		int var1 = 1;
		int var2 = 2;
		
		if(var1 > var2) {
			System.out.println("var1�� var2���� ũ��.");
		} else {
			System.out.println("var1�� var2���� �۴�.");
		}
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {
			System.out.println("n1�� n2���� ũ��.");
		} else if(n2 > n3) {
			System.out.println("n2�� n3���� ũ��.");
		} else if(n3 > n4) {
			System.out.println("n3�� n4���� ũ��.");
		} else {
			System.out.println("n4�� ���� ũ��.");
		}
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		System.out.println("�Է� ���� : "+score);
		
		if(score >= 90 ) {
			System.out.println("A �Դϴ�.");
		} else if (score >= 80) {
			System.out.println("B �Դϴ�.");
		} else if (score >= 70) {
			System.out.println("C �Դϴ�.");
		} else if (score >= 60) {
			System.out.println("D �Դϴ�.");
		} else {
			System.out.println("F �Դϴ�.");
		}
		
	}
}