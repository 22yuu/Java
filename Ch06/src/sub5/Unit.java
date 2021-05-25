package sub5;


// 추상클래스 
// - 1개 이상 추상메서드를 갖는 클래스
// - 객체 생성 안됨
// - 상속을 위한 클래스
public abstract class Unit {
	
	public void move() {
		System.out.println("Unit move...");
	}
	
	// 추상메서드
	public abstract void attack(); // 유닛들의 공격 방식은 다양(마린은 총쏘고, 질럿 저글링은 근거리) 따라서 추상메서드로 선언 후
	// 자식 클래스에서 각 유닛들의 공격 방식을 재정의하여 구체화 시킬 것임.
	
}
