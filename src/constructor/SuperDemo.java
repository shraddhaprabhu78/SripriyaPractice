package constructor;

public class SuperDemo {

	public static void main(String[] args) {
		B1 ob = new B1();
		ob.display();
		ob.show();
		
	}

}
class A1 {
	int a = 40;
	int b = 20;
	void display()
	{
		System.out.println("Parent class method");
	}
	A1()
	{
		System.out.println("Parent class constructor ");
		}
	void show()
	{
		System.out.println("Show method of parent class");
	}
}
class B1 extends A1 {
	int a = 50;
	int c = 10;
	void display()
	{
		
		super.display();
		System.out.println("Super b = "+b); //20
		System.out.println("Child a = "+a);//50
		System.out.println("Child class method");
		
		System.out.println("Super a = "+super.a);//40
	}
	void show()
	{
		System.out.println("Show method of child class"); 
	}
	
	B1()
	{
		System.out.println("Child  class constructor ");
	}
}