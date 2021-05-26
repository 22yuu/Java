package sub1;

/*
 * 날짜 : 2021/05/26
 * 이름 : 이진유
 * 내용 : 자바 제네릭 클래스 실습하기
 * */

public class GenericTest {
	
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 2000);
		Banana banana = new Banana("대만", 3000);
		
		FruitBox<Apple> box1 = new FruitBox();
		box1.setFruit(apple);
		
		FruitBox<Banana> box2 = new FruitBox();
		box2.setFruit(banana);
		
	}
}
