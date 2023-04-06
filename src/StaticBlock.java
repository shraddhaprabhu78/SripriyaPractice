
public class StaticBlock {
	//instance block will call as soon as object created 
	{
		System.out.println("This is instance block");
	}
// only inner class is allowed to be static. as soon as class loaded in main memory static block executed first.after that only other methods will executed
	static
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		
		StaticBlock obj = new StaticBlock();
		
	}

}
