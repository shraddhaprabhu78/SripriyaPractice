package encapsulationDemo;

public class StudentTest {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setStudentName("Sripriya");
		obj.setRollnumber(1001);
		obj.setAge(21);
		System.out.println("Student Name is : "+obj.getStudentName());
		System.out.println("Student Rollnumber is : "+obj.getRollnumber());
		System.out.println("Student age is : "+obj.getAge());
		System.out.println("____________________________________________________");
		Student obj1 = new Student();
		obj1.setStudentName("Sukumar");
		obj1.setRollnumber(1002);
		obj1.setAge(24);
		System.out.println("Student Name is : "+obj1.getStudentName());
		System.out.println("Student Rollnumber is : "+obj1.getRollnumber());
		System.out.println("Student age is : "+obj1.getAge());
		
		
	}

}
