package jjw.solo.member.face;

import java.util.Scanner;

import jjw.solo.member.logIn.LogIn;

public class MenuInterface {

	private Scanner sc = new Scanner(System.in);
	
	public void inter() {
		
		System.out.println("\n====================");
		System.out.println("1. 로 그 인");
		System.out.println("2. 종 료");
		System.out.println("====================");
		System.out.print("행동 선택 : ");
		
	}
	
	public void interfaceLogic() {
		
		boolean Loop = true;
		while(Loop == true) {
			inter();
			int select = sc.nextInt();
				switch(select) {
				case 1 :
					LogIn logIn = new LogIn();
					logIn.logIn();
					Loop = false;
					break;
				case 2 :
					System.out.println("시스템을 종료한다.");
					Loop = false;
					break;
			}
		}
		
	}

}
