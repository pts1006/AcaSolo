package jjw.solo.standardExam;

public class MainApp {

	public static void main(String[] args) {
		
		Animal bird = new Bird();
		bird.eat();
		
		System.out.println("\n");
		
		//강제 형 변환해 줌으로써, 다른 Animal들은 할 수 없고, Bird만 할 수 있는 행위를 불러 온다.
		
		Bird bird2 = (Bird) bird;	// 다운 캐스팅.
		bird2.fly();
		bird2.layEggs();
		
		System.out.println("\n");
		Flyer f = new Superman();
		f.fly();
		((Human) f).think();	// 마찬가지. 다운 캐스팅.
		
		//특정 인스턴스가 특정 지역에 포함되는 인스턴스가 맞느냐를 확인하는 방법.
		System.out.println("\n");
		f = new Bird();		// 위의 Superman과 마찬가지로 Flyer f를 쓴다.
		f.fly();
		// f가 어디까지 연결돼 있는지 알고 싶다.
		System.out.println(f instanceof Flyer);
		System.out.println(f instanceof Bird);
		System.out.println(f instanceof Superman);
		
		System.out.println("\n");
		Flyer[] arr = new Flyer[2];
		arr[0] = new Bird();
		arr[1] = new Superman();
		
		for (Flyer free : arr){
			free.fly();
			if (free instanceof Human) {
				System.out.println();
				((Human) free).think();
			}
		}
	}
	
}
