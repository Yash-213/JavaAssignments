package oops;

class Student {
	private String studentName;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentProgrammingLanguage() {
		return studentProgrammingLanguage;
	}
	public void setStudentProgrammingLanguage(String studentProgrammingLanguage) {
		this.studentProgrammingLanguage = studentProgrammingLanguage;
	}
	private String studentRollNumber;
	private String studentProgrammingLanguage;
}
public class Encapsulation {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.setStudentName("Yash Waychal");
		stud.setStudentRollNumber("C69");
		stud.setStudentProgrammingLanguage("Java, Python");
		
		System.out.println("Student Name: " + stud.getStudentName());
		System.out.println("Student Roll no.: " + stud.getStudentRollNumber());
		System.out.println("Student Programming language: " + stud.getStudentProgrammingLanguage());
	}
}