package week3.Day1.org.student;

import week3.Day1.org.department.Department;

public class Student extends Department{

	public void studentName() {
		
		System.out.println("studentName : Janani");
		
	}
	public void studentDept() {
		
		System.out.println("studentDept : MCA");
		
	}
	
	public void studentId() {
		
		System.out.println("studentId : 9876543");
		
	}
	
	public static void main(String[] args) {
		
		Student sno = new Student();
		sno.collegeName();
		sno.collegeCode();
		sno.collegeRank();
		sno.deptName();
		sno.studentName();
		sno.studentDept();
		sno.studentId();
		
	}
}
