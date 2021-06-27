package jjw.solo.abstractclass;

public class Bird extends Animal {

	public void run() {
		System.out.println("날개로 날아다닌다.");
		super.run();
	}
	
	public void eat() {
		System.out.println("주로 벌레를 먹는다.");
	}
	
	public void color() {
		System.out.println("황색.");
	}
	
}
