package ch04;

public class P63 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// & 연산
		System.out.println(a == b & test());
		
		// && 연산
		System.out.println( a == b && test());
		
		/*
		 *  &와 &&의 차이
		 *  양쪽 항이 모두 true일때만 결과도 treu라는연산 결과를 나타낸다는 것은 같지만
		 *  && 연산은 왼쪽 항이 falsse라면 오른쪽 항은 확인을 하지 않고 &은 확인을 하는 차이점이 있다.
		 * */
	}
	
	public static boolean test() {
		System.out.println("test()메서드 실행됨");
		return true;
	}
}
