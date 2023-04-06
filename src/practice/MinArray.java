package practice;

public class MinArray {

	public static void main(String[] args) {
	
		int a[]= {10,30,4,3,66,3,90};
		int minvalue = a[0];
		for (int i =0;i<a.length;i++)
		{
			if(a[i]<minvalue)
			{
				minvalue = a[i];
			}
		}
		
		System.out.println(minvalue);
	}

}
