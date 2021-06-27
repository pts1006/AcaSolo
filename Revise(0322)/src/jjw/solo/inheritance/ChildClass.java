package jjw.solo.inheritance;

public class ChildClass extends ParentClass {

	private String color;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public ChildClass() {
		super("삼성자동차");
	}
	
	public void run() {
		System.out.println("움직인다.");
	}
	
	@Override
	public void toPrint() {
		System.out.println("기능을 재정의했다.");
	}
	
}
