package practice;

public class AscDesArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,55,6,32,6,98};
		int temp;
		for (int i = 0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			
		}
		for (int i = 0;i<a.length;i++)
	
		System.out.print(a[i]+ " ");
	
		
	}

}
