package jjw.solo.car;

public class Car {

	private Tire frontLeftTire;
	private Tire frontRightTire;
	private Tire rearLeftTire;
	private Tire rearRightTire;
	
	public Car() {
		frontLeftTire = new Tire("앞 왼쪽 타이어", 2);
		frontRightTire = new Tire("앞 오른쪽 타이어", 2);
		rearLeftTire = new Tire("뒤 왼쪽 타이어", 4);
		rearRightTire = new Tire("뒤 오른쪽 타이어", 4);
	}
	
	public void run() {
		frontLeftTire.toString();
		frontRightTire.toString();
		rearLeftTire.toString();
		rearRightTire.toString();
	}
	
}
