package jjw.solo.standalone;

public class SamsungTV implements RemoteControl {

	//클래스를 상속 받을 때에는 extends, 인터페이스는 implements
	
	@Override
	public void powerOn() {
		System.out.println("삼성 - 전원 on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("삼성 - 전원 on");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("삼성 - 볼륨 up");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("삼성 - 볼륨 down");
		
	}

	
	
}
