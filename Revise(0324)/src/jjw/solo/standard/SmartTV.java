package jjw.solo.standard;

/*
인터페이스는 다중 상속이 가능하다.
*/

public class SmartTV implements Searchable, RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("SmartTV - turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV - turnOn");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("SmartTV - setVolume");
	}

	@Override
	public void search(String url) {
		System.out.println("SmartTV - search : " + url);
	}

}
