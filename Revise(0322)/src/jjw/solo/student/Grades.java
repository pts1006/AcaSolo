package jjw.solo.student;

public class Grades {

	Student[] student = new Student[10];
	int rank[] = {1,1,1,1,1,1,1,1,1,1};
	
	public Grades() {
		
		initData();
		
	}
	
	private void initData() {
		
		student[0] = new Student("가", "20210101", 80, 88, 92);
		student[1] = new Student("나", "20210102", 88, 90, 100);
		student[2] = new Student("다", "20210103", 12, 38, 92);
		student[3] = new Student("라", "20210104", 5, 94, 10);
		student[4] = new Student("마", "20210105", 10, 88, 52);
		student[5] = new Student("바", "20210106", 82, 97, 16);
		student[6] = new Student("사", "20210107", 40, 88, 12);
		student[7] = new Student("아", "20210108", 38, 60, 14);
		student[8] = new Student("자", "20210109", 20, 85, 91);
		student[9] = new Student("차", "20210110", 18, 40, 10);
		
		rank();
		
	}
	
	private void rank() {
		
		for(int i = 0; i < student.length - 1; i++) {
			for(int j = i + 1; j < student.length; j++) {
				if(student[i].getAvg() > student[j].getAvg()) {
					++rank[j];
				} else if (student[i].getAvg() < student[j].getAvg()) {
					++rank[i];
				}
			}
		}
			
	}
	
	public void studentList() {
		
		for(int i = 0; i < student.length; i++) {
			student[i].toString();
			System.out.println("\t" + rank[i] + "등");
		}
	}
	
	public void studentName(String name) {
		
		for(int i = 0; i < student.length; i++) {
			if(student[i].getName().equals(name)) {
				student[i].toString();
				System.out.println("\t" + rank[i] + "등");
				break;
			}
		}
	}
	
	public void studentID(String ID) {
		
		int count = 0;
		for(Student st : student) {
			if (st.getStudentID().equals(ID)) {
				st.toString();
				System.out.println("\t" + rank[count] + "등");
				break;
			}
			count++;
		}
	}
	
}
