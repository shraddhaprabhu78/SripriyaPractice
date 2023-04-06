package oopsDemo;
//abstract class



	public class Dog extends animal{
		
		public  void animalVoice()
		{
			System.out.println("Bow Bow");
		}

	 
	   public static void main(String args[]){
		   
	animal obj = new Dog();
	  obj.animalVoice();
	
	   }
	

}
