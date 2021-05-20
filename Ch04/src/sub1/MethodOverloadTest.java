package sub1;

/*
 * 날짜 : 2021/05/20
 * 이름 : 이진유
 * 내용 : 자바 오버로드 메서드(함수) 실습
 * */


public class MethodOverloadTest {

	public static void main(String[] args) {
		
		int r1 = add(3);
		int r2 = add(2,3);
		String r3 = add("이진유");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
	}
	
	public static int add(int num) {
		return num++;
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static String add(String str) {
		
		
		return str+"님 반갑습니다.";
	}
}
