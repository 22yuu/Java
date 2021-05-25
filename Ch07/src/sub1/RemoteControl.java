package sub1;

// 인터페이스는 상속 받는다 라는 표현보다 구현을 한다라는 표현
public interface RemoteControl {

	
//  인터페이스에서는 이처럼 메서드 구현이 불가	
//	public void soundUp() {
//		
//	}
	
	public void powerOn();
	public void powerOff();
	
	public void chUp();
	public void chDown();
}
