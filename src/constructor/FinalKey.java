package constructor;

public class FinalKey {
	
	 //final int a;
	//defining final variable
//	1. with constructor, 2 with instance block
	//FinalKey()
//	{
//		a = 2000;
//	}
	//2 
//	
//	{
//		a = 2000;
//	}
	// if it is static varibale need to initialize value directly or only through static block not with instance or constructor.

//	{
//		a = 2000;
//		
//	}
	
	

	public static void main(String[] args) {
		
		newlogin o = new newlogin();
		o.display();
	//	System.out.println("final a = "+o.a);
	}

}
 class login{ //The type newlogin cannot subclass the final class login
	
	 final int a;
	
	 {
			a = 12000;
			
		}
	 void display()
	{
		
		 System.out.println("login parent class");
		
	}
	 final void sub()
	 {
		 System.out.println("Final sub method cannot be override");
	 }
}
 class newlogin extends login{

	void display()
	{
		
		sub();
		System.out.println("Final a = "+a );
		System.out.println("new login child  class");
	}
	
//	void sub() //Cannot override the final method from login
	{
		
	}
}