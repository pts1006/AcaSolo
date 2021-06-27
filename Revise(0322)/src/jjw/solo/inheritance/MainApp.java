package jjw.solo.inheritance;

public class MainApp {

	public static void main(String[] args) {
		
		ParentClass pa = new ParentClass("현대자동차");
		pa.model = "sonata";
		pa.speed();
		pa.toString();	// 부모 클래스는 자식 클래스에 있는 걸 활용할 수 없다.
		
		System.out.println("\n자식클래스");
		
		ChildClass ch = new ChildClass();
		ch.model = "sm5";
		ch.speed();
		ch.toPrint();
		ch.setColor("red");
		System.out.println(ch.getColor());
		ch.run();
		
		
	}

}
