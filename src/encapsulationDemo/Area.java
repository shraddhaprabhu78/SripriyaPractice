package encapsulationDemo;

public class Area {
	private int height;
	private int width;
	int Area1;
	
	public void setArea(int height,int width)
	{
		this.height = height;
		this.width = width;
		
	}
	
	public void getArea()
	{
		int A = height*width;
		System.out.println("Total area is : "+A);
	}
//int getArea()
//	{
//	int A = height*width;
//		return A;
//	}
	

	public static void main(String[] args) {
		
		Area obj = new Area();
		obj.setArea(20, 80);
	//System.out.println(obj.getArea());
		obj.getArea();
	}

}
