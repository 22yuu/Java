package sub1;

/*
 * 날짜 : 2021/05/20
 * 이름 : 이진유
 * 내용 : 자바 메서드(함수) 실습하기
 * */


public class MethodTest {

	public static void main(String[] args) {
			
		
		// 메서드 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
	}
	
	// 메서드 정의
	public static int f(int x) {
		
		int y = 2 * x + 3;
		return y;
	}
}
