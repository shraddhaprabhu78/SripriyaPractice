package practice;


//class inside another class is inner class-innerclass only can be a satatic not outer class  

public class InnerclassDemo {

	public static void main(String[] args) {
		//if display method is static directly can call like outer.inner.display()
		//outer.inner.display();
		outer.inner  obj = new outer.inner();
		obj.display();
	}

}

//only innwer class allowed to be static
class outer{
	
 static class inner {
	
	 void display()
	{
		System.out.println("Static method from inner class");
	}
		
	}
}
