package jjw.solo.inheritance;

public class ParentClass {

	@SuppressWarnings("unused")
	private String name;
	public String model;
	
	public void speed() {
		System.out.println(model + "의 최고 시속 180Km/h");
	}
	
	public void toPrint() {
		
	}
	
	public ParentClass() {
		
	}
	
	public ParentClass(String name) {
		this.name = name;
	}
	
}
