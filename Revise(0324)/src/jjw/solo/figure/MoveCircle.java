package jjw.solo.figure;

public class MoveCircle extends Shape implements Movable, Drawable {

	public MoveCircle() {
		
	}
	
	public void draw() {
		System.out.println("MoveCircle - draw");
	}
	
	public void move() {
		System.out.println("MoveCircle - move");
	}
	
}
