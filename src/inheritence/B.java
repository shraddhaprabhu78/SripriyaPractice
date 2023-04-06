package inheritence;



public class B extends A {

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
	 
	
	B()
	{
		System.out.println("Child  class constructor ");
	}


	public static void main(String[] args) {

		B ob = new B();
		ob.display();
		ob.show();
		ob.test();
}
}