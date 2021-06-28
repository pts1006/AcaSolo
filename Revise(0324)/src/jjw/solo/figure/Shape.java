package jjw.solo.figure;

public class Shape {

	private String color = "black";
	private int width = 3;
	
	public Shape() {
		
	}
	
	public Shape(String color) {
		this.color = color;
	}
	
	public Shape(String color, int width) {
		this.color = color;
		this.width = width;
	}
	
	public void print() {
		System.out.println("\t" + color + " : " + width);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
