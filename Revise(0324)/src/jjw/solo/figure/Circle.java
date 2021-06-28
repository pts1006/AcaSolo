package jjw.solo.figure;

public class Circle extends Shape implements Drawable {

	public Circle() {
		
	}
	
	public Circle(String color, int width) {
		super(color, width);
	}
	
	public void draw() {
		
		System.out.println("Circle - draw");
		
	}
	
}
