package pkg1.dto;

public class Parent2 {

	// 필드
	private String lastName = "김";
	private int money = 50000;
	
	// 기본 생성자
	public Parent2() {
		
	}
	// 매개변수 생성자

	public Parent2(String lastName, int money) {
		super();
		this.lastName = lastName;
		this.money = money;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
@Override
 	public String toString() {
	 return "Parent : " + lastName + "/" + money;
	 
}
	


	
	
	
	
}
