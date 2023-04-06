package encapsulationDemo;

public class ConsructorDemo {
// constructor - as soon as object created constructor is invoked 
	
	ConsructorDemo()
	{
		System.out.println("This is constructor ");
	}
	
	ConsructorDemo(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	//with same no of arguments with different dattypes it will allow
	ConsructorDemo(float a,float b)
	{
		System.out.println("Float argument ");
	}
	
	ConsructorDemo(short a)
	{
		System.out.println("short  argument ");
	}
	
	public static void main(String[] args) {
		ConsructorDemo obj = new ConsructorDemo();
		System.out.println("End of main method");
		// each constructor we have to create seperate object
		ConsructorDemo obj1 = new ConsructorDemo(10.2f,20.5f);
		ConsructorDemo obj2 = new ConsructorDemo((short)10);
		
		
			}

}
