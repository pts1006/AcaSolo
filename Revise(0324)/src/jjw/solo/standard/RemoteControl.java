package jjw.solo.standard;

/*
인터페이스  = 추상메서드 + 상수로 구성
: 소스를 변경하지 않고도 클래스를 교체하기 위해서
	- 모든 클래스들이 동일한 메서드 선언부를 가지도록 설계 ㅡㅡㅡ 개발 표준을 정해 준다.
	- 이곳의 모든 메서드 ㅡㅡ 추상메서드 (public abstract 생략 가능 == 어차피 모두 같으니까)
	- 모든 필드들 ㅡㅡ 상수
	
	- jdk8 ㅡㅡ default 메서드라는 게 추가 됨. (모든 메서드 = 추상메서드, 부정)
		: 기존 구현 클래스를 수정하지 않고 인터페이스 기능 확장
 */

public interface RemoteControl {

	public int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	void turnOff();	// public abstract 생략 가능하므로 생각했다.
	void setVolume(int volume);
	
	//default 메서드 추가.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		} else {
			System.out.println("무음 해제");
		}
	}
	
}
