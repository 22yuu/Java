package sub1;

/*
 * 날짜 : 2021/05/25
 * 이름 : 이진유
 * 내용 : 자바 인터페이스 실습하기
 * */

public class InterfaceTeset {
	
	public static void main(String[] args) {
		// 인터페이스 - 클래스 설계의 표준 가이드를 역할
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamSung();
		
		lg.powerOn();
		lg.chUp();
		lg.powerOff();
		
		
		samsung.powerOn();
		samsung.chDown();
		samsung.powerOff();
	}
}
