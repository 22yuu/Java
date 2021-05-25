package sub5;

/*
 * 날짜 : 2021/05/25
 * 이름 : 이진유
 * 내용 : 자바 추상클래스 실습
 * */

public class AbstractTest {
	
	public static void main(String[] args) {
		
		Unit 		marin = new Marin();
		Unit 		zealot = new Zealot();
		Unit	zergling = new Zergling();
		
		marin.move();
		zealot.move();
		zergling.move();
		
		marin.attack();
		zealot.attack();
		zergling.attack();
		
		
		
		
	}
}
