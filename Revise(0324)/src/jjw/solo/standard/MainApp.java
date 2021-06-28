package jjw.solo.standard;

/*
상속 관계
	 다형성 : 부모 타입의 참조 변수(RemoteControl)가 자식 객체(인스턴스)를 참조할 수 있다.
	 		메서드를 호출하면 참조하는 대상의 메서드를 호출. 실행 결과가 다르게 나온다.
	 부모-자식간에 형변환(캐스팅) : 다운캐스팅, 업캐스팅
*/

public class MainApp {

	public static void main(String[] args) {
		
		RemoteControl tv = new MuteTV();
//		tv.search("naver");
		tv.turnOn();
//		tv.setMute(true);
//		tv.setMute(false);
		
		tv = new SkTV();
		tv.turnOn();
	
	}
	
}
