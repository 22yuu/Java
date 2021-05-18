package sub2;

import java.util.Iterator;

/*
 * 날짜 : 2021/05/17
 * 이름 : 이진유
 * 내용 : 자바 switch 실습하기
 * */

public class ForTest {

	public static void main(String[] args) {
		
		// for
		for (int i = 1; i <=3; i++) {
			System.out.println("Hello Java!");
			System.out.printf("%d Hello Java! \n",i);
		}

		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1부터 10까지 짝수함
		sum = 0;
		
		for ( int i = 2; i <= 10; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
		
		// 중첩 for
		
		// 구구단
		for ( int i = 2; i <= 9; i++) {
			System.out.println("***" + i + " 단 *** ");
			for( int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
		
		// 별 삼각형 I
		for (int start = 1; start<=10; start++) {
			for (int end=1; end <= start; end++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별 삼각형 II
		for(int a = 1; a<5; a++) {
			
			for(int b = 1; b<=5-a;b++) {
				System.out.print("☆");
			}
			
			for(int c = 1; c<=a; c++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
