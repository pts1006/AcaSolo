package jjw.solo.anonymous;

public class MainApp {

	public static void main(String[] args) {
		// 익명 객체 : 클래스 선언과 객체 생성을 동시에.
		InterfaceA a = new InterfaceA() {
						public void methodA() {
							System.out.println("a methodA 실행");
						}
					};
		a.methodA();
		
		//람다 표현식 (익명 객체를 단순하게 표현)  ->
		InterfaceA b = () -> { System.out.println("b methodA 실행"); };
		b.methodA();
	}

}
