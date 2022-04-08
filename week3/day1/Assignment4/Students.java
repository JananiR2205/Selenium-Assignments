package week3.Day1.StudentInfo;

public class Students {
	
	public void getStudentInfo() {
		
		System.out.println("Getting the student Information");
		
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Student ID " + id);
		System.out.println("Student Name " + name);
		
	}
	public void getStudentInfo(String email , int phno) {
		
		System.out.println("Student email " + email);
		System.out.println("Student Phone number " + phno);
		
	}

	public static void main(String[] args) {
		
		Students stud = new Students();
		stud.getStudentInfo();
		stud.getStudentInfo(12345, "Janani");
		stud.getStudentInfo("janu@gmail.com", 987654321);
		

	}

}
