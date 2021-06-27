package jjw.solo.abstractclass;

public abstract class Animal {

	public void run() {
		System.out.println("상위 객체가 취하는 행동");
	}
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("잔다.");
	}
	
}
