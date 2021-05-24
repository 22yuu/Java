package sub1;

/*
 * 날짜 : 2021/05/24
 * 이름 : 이진유
 * 내용 : 자바 클래스 실습하기
 * */

class ClassTest {

	public static void main(String[] args) {
		
		
		// 객체 생성
		Account kb = new Account("국민은행", "123-1213-1234", "김유신", 10000);
		Account wr = new Account("우리은행", "121-1010-1021", "김춘추", 30000);
		
		
		
// 직접 참조 -> 좋지 못한 접근		
//		kb.bank = "국민은행";
//		kb.id = "123-1213-1234";
//		kb.name = "김유신";
//		kb.money = 10000;
//		
//		wr.bank = "우리은행";
//		wr.id = "121-1010-1021";
//		wr.name = "김춘추";
//		wr.money = 30000;
		
		//객체 활용
		kb.deposit(40000);
		kb.withdraw(5000);
		//kb.money++; // 취약코드 - deposit, withdraw 메서드를 이용해서 잔고를 처리 해야하는데, 이렇게 
					// 이렇게 직접적으로 외부에서 money 변수에 참조해서 변경이 가능하게 되면 취약코드가 됨
					// 따라서 접근 권한을 설정 해줘서 변경 못하게 해줘야 한다.
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
		//wr.money -= 1; // 취약코드 
		wr.show();
	}
}
