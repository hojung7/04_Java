package pkg1.dto;

public class Child2 extends Parent2{

	private String car;
	
	public Child2() {}

	public Child2(String lastName, int money, String car) {
		super(lastName, money);
		this.car = car;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "Child : " + getLastName()+ "/" + getMoney() + "/" + car;
	}



	
	
	
	
	
	
	
	
	
}
