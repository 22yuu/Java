package sub1;

public class Banana {
	
	private String country; // 원산지
	private int price; // 가격
	
	public Banana() {
		this.country = "대한민국";
		this.price = 2000;
	}
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		System.out.println("사과 원산지 : " + country);
		System.out.println("사과 가격 : " + price);
		return super.toString();
	}
}
