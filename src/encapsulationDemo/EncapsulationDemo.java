package encapsulationDemo;

public class EncapsulationDemo {
	
	private int age;
	
	void setAge(int age)
	{
		if (age>0)
		{
		this.age = age;
		}
	}
	
void getAge()
	{
		
		System.out.println("Given Age is : "+age);
	}
	

	public static void main(String[] args) {
		
		EncapsulationDemo obj = new EncapsulationDemo();
				obj.setAge(30);
		obj.getAge();
		//System.out.println(obj.getage());
		
		
	}

}
