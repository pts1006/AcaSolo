package jjw.solo.standalone;

public class MainApp {

	public static void main(String[] args) {
		
//		RemoteControl tv = new SamsungTV();
		// 다형성. Samsung을 Lg로만 바꿔 주면 결과도 달라짐.
		// 이마저도 안 바꿔도 됨. BeanFactory 예시.
		
		RemoteControl tv = (RemoteControl)BeanFactory.getBean(args[0]);
															// run config argument에 입력
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
