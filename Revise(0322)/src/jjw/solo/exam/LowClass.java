package jjw.solo.exam;

public class LowClass extends SuperClass {

	public LowClass() {
		super();
	}
	
	public void methodTest() {
		System.out.println("나는 하위 class 메소드 입니다.");
		System.out.println("==========================");
		super.methodTest();
		
	}
	
	public void run() {
		super.method();
	}
	
}
