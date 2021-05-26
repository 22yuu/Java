package sub3;

/*
 * 날짜 : 2021/05/26
 * 이름 : 이진유
 * 내용 : 자바 String 멤버 테스트
 * */

public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
		// length
		System.out.println("str 문자열 길이 : "+str.length());
		
		// charAt
		
		System.out.println("str 1번째 문자 : " + str.charAt(0));
		System.out.println("str 7번째 문자 : " + str.charAt(6));
		
		// substring
		System.out.println("str에서 0 ~ 5까지 문자열 : " + str.substring(0,5));
		System.out.println("str에서 6에서 마지막까지 문자열 : " + str.substring(6));
		
		
		// indexOf, lastIndexOf - 문자열에서 특정문자 인덱스 추출
		System.out.println("str에서 앞에서 부터 문자 e 인덱스 : " + str.indexOf('e'));
		System.out.println("str에서 앞에서 부터 문자 e 인덱스 : " + str.lastIndexOf('e'));
		
		// replace
		System.out.println("str 문자열에서 'Korea'를 'Busan'으로 교체 : " + str.replace("Korea", "Busan"));
		System.out.println("str 문자열에서 'Hello'를 'Welcome'으로 교체 : " + str.replace("Hello", "Welcome"));
		
		// valueOf - 기본타입
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = String.valueOf(var3);
		String s4 = "" + var3;
		
		
	}
}
