package constructor;

public class ChainingConstructor {
	
	ChainingConstructor()
	{
		System.out.println("Default Constructor");
	}
	ChainingConstructor(int a)
	{
		this(20,30);
		System.out.println("argument one  Constructor");
		
	}
	ChainingConstructor(int a,int b )
	{
		this(20.00f,30);
		System.out.println("two argument Constructor with 2 integers");
	}
	ChainingConstructor(float a,int b )
	{
		
		this((short)10,30);
		System.out.println("two argument Constructor with float and num");
	}
	ChainingConstructor(short a,int b )
	{
		//this(20); // error like -- Recursive constructor invocation ChainingConstructor(int)
		System.out.println("two argument Constructor with short and num");
	}

	public static void main(String[] args) {
		ChainingConstructor obj = new ChainingConstructor();
		ChainingConstructor obj1 = new ChainingConstructor(10);
		
				//this(20); // error like --"Constructor call must be the first statement in a constructor

			}


 

	}


