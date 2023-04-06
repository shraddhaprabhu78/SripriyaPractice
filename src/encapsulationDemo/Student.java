package encapsulationDemo;

public class Student {
	private String  studentname;
	private int rollnumber;
	private int age;
	
public	String getStudentName()
	{
		return studentname;
	}
	public int getRollNumber()
	{
		return rollnumber;
	}
	
	public void setStudentName(String stuname)
	{
		this.studentname = stuname;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 
	

}
