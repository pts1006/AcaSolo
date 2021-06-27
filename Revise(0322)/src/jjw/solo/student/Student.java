package jjw.solo.student;

public class Student {

	private String name, studentID;
	private int kor, math, history, sum;
	private float avg;
	
	public Student(String name, String studentID, int kor, int math, int history) {
		
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.math = math;
		this.history = history;
		this.sum = kor + math + history;
		this.avg = sum / 3.0f;
		
	}

	public String getName() {	// 학생 이름 가져오기
		return name;
	}

	public String getStudentID() {
		return studentID;
	}

	public float getAvg() {
		return avg;
	}
	
	public String toString() {
		
		System.out.println(name + " ");
		System.out.print("\t" + studentID + " ");
		System.out.print("\t" + kor + " ");
		System.out.print("\t" + math + " ");
		System.out.print("\t" + history + " ");
		System.out.print("\t" + sum + " ");
		System.out.printf("\t" + "%.1f ", avg);
		return null;
		
	}
	
}
