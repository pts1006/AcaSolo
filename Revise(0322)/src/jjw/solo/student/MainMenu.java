package jjw.solo.student;

import java.util.Scanner;

public class MainMenu {

	/*
	 
	  1. 전체 조회
	  2. 학번 조회
	  3. 종료
	   
	 */
	
	Scanner sc = new Scanner(System.in);
	Grades grades = new Grades();	// 데이터 초기 및 성적 처리된 객체를 생성
	
	public void menu() {
		
		boolean isFalse = false;
		int choiceMenu;
		
		do {
			menuTitle();
			System.out.println("원하는 작업 번호를 입력하세요.");
			choiceMenu = sc.nextInt();
			
			switch(choiceMenu) {
				case 1 :
					studentList();
					break;
				case 2 :
					System.out.println("=====================");
					System.out.println("검색할 학생명을 입력하세요.");
					String name = sc.next();
					selectName(name);
					break;
				case 3 :
					System.out.println("=====================");
					System.out.println("검색할 아이디를 입력하세요.");
					String ID = sc.next();
					selectID(ID);
					break;
				case 4 :
					System.out.println("종료한다.");
					sc.close();
					isFalse = true;
					break;
			}
		} while(!isFalse);
		
	}
	
	private void studentList() {
		// TODO Auto-generated method stub
		grades.studentList();
	}

	private void selectName(String name) {
		// TODO Auto-generated method stub
		grades.studentName(name);
	}

	private void selectID(String ID) {
		// TODO Auto-generated method stub
		grades.studentID(ID);
	}

	private void menuTitle() {
		
		System.out.println("== 성적 관리 ==");
		System.out.println("=1. 전체 조회=");
		System.out.println("=2. 이름 조회=");
		System.out.println("=3. 학번 조회=");
		System.out.println("=4. 종료하기==");
	
		
	}
	
}
