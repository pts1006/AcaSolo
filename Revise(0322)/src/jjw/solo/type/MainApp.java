package jjw.solo.type;

public class MainApp {
	
	public static void main(String[] args) {
		
		System.out.println("개");
		Animal dog = new Dog();
		dog.run();
		dog.eat();
		dog.sleep();
//		dog.color();	부모 타입으로 만들어졌기 때문에 거기서 없는 건 자식 클래스에 있다 해도 만들 수 없다.
		((Dog) dog).color();	// color메소드를 만들 수 없으니 강제로 타입 바꿈. (캐스팅)
		
		System.out.println("\n새");
		Animal bird = new Bird();
		bird.run();
		bird.eat();
		((Bird) bird).color();
		
		System.out.println("\n딴 개");
		Dog doggy =  new Dog();		//얘는 Dog 타입으로 만들어졌기 때문에, 그 안에 있는 메소드 그대로 씀.
		doggy.run();
		doggy.eat();
		doggy.sleep();
		doggy.color();
		
		System.out.println("\n짐승");
		Animal ani = new Animal();
		ani.run();
		
	}
}
