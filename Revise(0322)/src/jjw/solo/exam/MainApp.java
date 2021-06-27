package jjw.solo.exam;

public class MainApp {

	public static void main(String[] args) {
		LowClass low = new LowClass();
		low.method();	//부모만 가지고 있는 것. 그래서 부모 걸 고스란히 들고 옴.
		low.methodTest();	// 부모도 나도 갖고 있는 것. (내 거로 오버라이드)
		low.run();	// 내 거.
		
		//하나씩 실행 해 보면 차이를 알 수 있음.
	}

}
