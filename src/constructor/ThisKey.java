package constructor;

public class ThisKey {
	
	int a = 20;
	int b = 20;
	ThisKey()
	{
		this(100,100);
		System.out.println("Default constructor " );
	}
	
	ThisKey(int a,int b)
	{
		
		int c = a+b;
		System.out.println("two arg  constructor "+c );
	}
	
	 void add(int a, int b)
	{
		// error like Cannot use this in a static context
		 System.out.println("add method a = "+a); //40
			System.out.println("add method b = "+b);//50
	 a = 	 this. a; 
		 b = this.b ;
		int c = a+b;
		System.out.println("add method reult of c: "+c);//40
		System.out.println("this.a = "+this.a); //20
		System.out.println("this.b = "+this.b);//20
		
	}
	
	void sub(int a,int b)
	{
		
		this.add(40, 50);
		
		int c = b-a;
		System.out.println("sub method c vlaue : "+c);//10
		System.out.println("sub method value of a: "+a);//30
		System.out.println("sub method value of b: "+b);//40
	}
	
	int mul()
	{
		//this.sub(50, 50);
		int c = a*b;
		System.out.println(a);
		System.out.println(b);
	return c;
			
	}

	public static void main(String[] args) {
		ThisKey obj = new ThisKey();
		
		
	obj.add(40, 50);
	System.out.println("*****************************");
	obj.sub(30,40);
	System.out.println("*****************************");
	System.out.println(obj.mul());
               
	}

}
