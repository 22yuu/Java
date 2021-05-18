package sub1;

import java.util.Scanner;

public class SwitchTest {
	
	/*
	 * 날짜 : 2021/05/18
	 * 이름 : 이진유
	 * 내용 : 자바 switch 실습하기
	 * */
	
	public static void main(String[] args) {
		
		String animal = "tiger";
		
		switch(animal) {
		
		case "lion":
			System.out.println("사자입니다.");
			break;
		case "eagle":
			System.out.println("독수리입니다.");
			break;
		case "tiger":
			System.out.println("호랑이입니다.");
			break;
		default:
			System.out.println("Nothing....");
			break;
		}
		
		// 연습문제
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		System.out.println("입력 점수 : " + score);
		
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
