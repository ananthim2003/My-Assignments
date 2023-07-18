package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("applyBreak");
	}
	public void applyGear() {
		System.out.println("applyGear");
	}
	public void switchOnAc() {
		System.out.println("switchOnAc");
	}
	public void applyAccleratek() {
		System.out.println("applyAccleratek");
	}
	public static void main(String[] args) {
		Car myCar= new Car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchOnAc();
		myCar.applyAccleratek();
	}

}
