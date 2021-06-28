package jjw.solo.standard;

public class SkTV implements RemoteControl {

	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("SK - turnOn");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("SK - setVolume");
		
		//입력된 볼륨이 최대 볼륨을 초과하면, 입력된 볼륨을 최대 볼륨으로 설정.
		if(volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
			
		//입력된 볼륨이 최소 볼륨보다 작으면, 그 값을 최소 볼륨으로 설정.
		} else if(volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}

}
