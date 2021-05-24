package sub1;

public class Account {

	// 속성(멤버변수) : 클래스의 멤버변수는 private 선언으로 캠슐화
	private String bank;
	private String id;
	private String name;
	private int money;
	
	
	 public Account(String bank, String id, String name, int money) {
		 this.bank = bank;
		 this.id = id;
		 this.name = name;
		 this.money = money;
	}
	
	
	
	// 기능(멤버 메서드)
	public void deposit(int money) {
		this.money += money;
		
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void show() {
		System.out.println("=======================");
		System.out.println("은행명 : " + bank);
		System.out.println("은행명 : " + id);
		System.out.println("은행명 : " + name);
		System.out.println("은행명 : " + money);
		System.out.println("=======================");
	}
}
