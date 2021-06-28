package jjw.solo.figure;

public class Paint {

	Shape[] shape;
	
	public Paint() {
		shape = new Shape[6];
	}
	
	public void prinAll() {
		
		for(Shape s : shape) {
			if(s instanceof Movable) {
				((Movable) s).move();
			}
			if(s instanceof Drawable) {
				((Drawable) s).draw();
			}
			s.print();
		}
	}
	
}
