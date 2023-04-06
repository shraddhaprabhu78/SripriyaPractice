package exception;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		int a =20;
		try {
		
		String st = null;
			System.out.println(st.length());
			
		}
			
		catch (NullPointerException np)
		{
			np.printStackTrace();
			System.out.println(np.getMessage());
		}
		finally {
			try
			{
			  int a1[] = new int[5];
			  a1[6]=5;
			}
			catch(ArrayIndexOutOfBoundsException ai)
			{
				ai.printStackTrace();
				System.out.println(ai.getMessage());
				System.out.println("Finally block");
			}
		}
		
			try {
				String s = "Hello";
				int num = Integer.parseInt(s);
			}
			catch(NumberFormatException n)
			{
				n.printStackTrace();
				System.out.println(n.getMessage());
				
			}
	
			try {
		int b = a/0;
		
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
		catch (Exception e)
		{
		e.printStackTrace();
		System.out.println("Message line : "+e.getMessage());
		}

		System.out.println("Exception Handled");
	}

}
