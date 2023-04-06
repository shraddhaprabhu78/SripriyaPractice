package string;

public class StringDemo {
	//SCP - Sting constant pool
	//String literal
	//string object

	public static void main(String[] args) {
		
		String s = "Sri";
		String s1 = "Sri";
		String s2 = "Sri";
		String s3 = new String("Sri");
		String s4 = new String("Sri");
		System.out.println(s==s1);//ture
		System.out.println(s2==s3);//false
		System.out.println(s3==s4);//false
		System.out.println(s4==s4);//true
		 String s5= s2.concat("priya");
		 System.out.println(s2.concat("priya"));
		 System.out.println(s2);
		
	}

}
