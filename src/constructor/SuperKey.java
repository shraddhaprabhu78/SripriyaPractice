package constructor;

public class SuperKey {
// super and this keywords cannot use in static and main methods.
	public static void main(String[] args) {
		
		B obj = new B(30);
		obj.add(100,100);
System.out.println("A = super a "+obj.a);
System.out.println("B = super b "+obj.b);
		System.out.println(obj.c);
	}

}
 class A{
	int a = 10;
	int b = 20;
	
	A(int a){
		System.out.println("Default A constructor" +a);
	}
	
	void add(int a,int b) {
		this.a = a;
		this.b = b;
				int c = a+b;
		System.out.println("Add method" +c);
	}
}
class B extends A{
	int a = super.a  ;
	int b = super.b;
	
	int c =10000000;
	
	B(int a)
	{
		super(10);
			
		System.out.println("B constructor" +a);
	}
	

	void add(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
		super.add(10, 10);
	}
	
	
}