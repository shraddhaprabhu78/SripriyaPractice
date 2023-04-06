package exception;

public class ExceptionMultipleCatch {

	public static void main(String[] args) {
		int a = 10;
		int a1[]= new int[5];
		String s = "SRI";
		try { 
		a= 10/1;
		int n = Integer.parseInt(s);
		a1[6] = 5;
		
		}
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException| NumberFormatException ae)
		{
			
			System.out.println(ae.getMessage());
			System.out.println("getstacktrace results: "+ae.getStackTrace());
			//System.exit(0);//to stop the thread execution ,in results finally will not execute
			ae.printStackTrace();
			
		}
	
//		catch (ArrayIndexOutOfBoundsException aie)
//		{
//			
//			
//		}
//	
	
		finally {
			
		System.out.println("ITs a finally block");
				
			}
		
		
		}
		
	}


