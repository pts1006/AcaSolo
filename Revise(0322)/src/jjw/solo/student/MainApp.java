package jjw.solo.student;

public class MainApp {

//	static Student[] student = new Student[10];
//	static int[] rank = {1,1,1,1,1,1,1,1,1,1};	//new int[10];
//	// int[] rank = new int[10];  rank = {1, };
	
	public static void main(String[] args) {
		
//		System.out.println("for-each문");
//		for(Student st : student) {
//			st.toString();
//		}

//		System.out.println("for문");
//		for(int i = 0; i < student.length; i++) {
//			student[i].toString();	//자신의 데이터만 출력
//			System.out.println("\t" + rank[i] + "등");	//순위를 출력.
//		}
		MainMenu menu = new MainMenu();
		menu.menu();
		
	}
	
}
