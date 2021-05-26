package sub2;

import sub1.Apple;

/*
 * 날짜 : 2021/05/25
 * 이름 : 이진유
 * 내용 : 자바 내장클래스 (기본 API 클래스) 실습하기
 * */

public class ClassTest {
	
	
	public static void main(String[] args) {
		
		// 정적객체
		Apple a1 = new Apple("한국", 3000);
		a1.toString();
		
		// 동적객체
		try {
			
			Class cls = Class.forName("sub1.Apple");
			Apple a2 = (Apple)cls.newInstance();
			
			a2.toString();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
