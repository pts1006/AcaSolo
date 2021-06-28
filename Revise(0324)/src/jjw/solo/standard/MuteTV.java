package jjw.solo.standard;

public class MuteTV implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("MuteTV - turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("MuteTV - turnOff");
	}

	@Override
	public void setVolume(int volume) {
		
	}

}
