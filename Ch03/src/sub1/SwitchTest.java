package sub1;

import java.util.Scanner;

public class SwitchTest {
	
	/*
	 * ��¥ : 2021/05/18
	 * �̸� : ������
	 * ���� : �ڹ� switch �ǽ��ϱ�
	 * */
	
	public static void main(String[] args) {
		
		String animal = "tiger";
		
		switch(animal) {
		
		case "lion":
			System.out.println("�����Դϴ�.");
			break;
		case "eagle":
			System.out.println("�������Դϴ�.");
			break;
		case "tiger":
			System.out.println("ȣ�����Դϴ�.");
			break;
		default:
			System.out.println("Nothing....");
			break;
		}
		
		// ��������
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		System.out.println("�Է� ���� : " + score);
		
		switch(score/10) {
		
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		
	}
}
