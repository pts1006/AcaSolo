package jjw.solo.figure;

public class MainApp {

	public static void main(String[] args) {
		
		Paint paint = new Paint();
		paint.shape[0] = new Circle();
		paint.shape[1] = new Rect("yellow", 3);
		paint.shape[2] = new Rect("red");
		paint.shape[3] = new Circle("red", 5);
		paint.shape[4] = new MoveCircle();
		paint.shape[5] = new Triangle();
		paint.prinAll();
		
	}
	
}
