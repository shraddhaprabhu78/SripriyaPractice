
public class ConstructorParameterised {
	
	ConstructorParameterised(int a,int b)
	{
		int c = a+b;
		System.out.println("Sum of a and b: "+c);
	}
	ConstructorParameterised(int a)
	{
		
		System.out.println("int a value : "+a);
	}
	
	ConstructorParameterised(short a)
	{
		
		System.out.println("short  a value : "+a);
	}
	ConstructorParameterised(long a)
	{
		
		System.out.println("Long   a value : "+a);
	}
	
	ConstructorParameterised()
	{
		boolean d = false;
		int c;
		System.out.println("boolean value from default constructor  : "+d);
	}
	

	public ConstructorParameterised(boolean b) {
		System.out.println("boolen value from parameterconstructor:  "+b);
	}
	public static void main(String[] args) {
		ConstructorParameterised obj = new ConstructorParameterised(10,20);
		ConstructorParameterised obj1 = new ConstructorParameterised((short)3333);
		ConstructorParameterised obj2 = new ConstructorParameterised((long)20000010);
		ConstructorParameterised obj3 = new ConstructorParameterised(3000010);
		ConstructorParameterised obj4 = new ConstructorParameterised((short)10);
		ConstructorParameterised obj5 = new ConstructorParameterised(true);
		ConstructorParameterised obj6 = new ConstructorParameterised();
	}

}
