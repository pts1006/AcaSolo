package jjw.solo.car;

public class Tire {

	private String location;
	private int wheelCount;
	
	public Tire(String location, int wheelCount) {
		this.location = location;
		this.wheelCount = wheelCount;
	}
	
	public String toString() {
		System.out.println(location + " " + wheelCount);
		return null;
	}
	
}
