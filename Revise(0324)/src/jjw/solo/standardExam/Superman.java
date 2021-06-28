package jjw.solo.standardExam;

public class Superman extends Human implements Flyer {

	public Superman() {}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("그냥 떠오른다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("망토로 난다.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("두 다리로 착륙한다.");
	}
	
}
