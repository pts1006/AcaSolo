package jjw.solo.figure;

public class Rect extends Shape implements Drawable {

	public Rect() {
		
	}
	
	public Rect(String color) {
		super(color);
	}
	
	public Rect(String color, int width) {
		super(color, width);
	}
	
	public void draw() {
		System.out.println("Rect - draw");
	}
	
}
