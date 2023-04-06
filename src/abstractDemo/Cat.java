package abstractDemo;

public class Cat extends Dog{

	
	@Override
	void pets() {
		System.out.println("Yes cat and Dogs are Pets");
		
	}
	public static void main(String[] args) {
		
		Cat obj = new Cat();
		obj.Breath();
		obj.eats();
		obj.sleeps();
		obj.shouts();
		obj.pets();

	}

	
	
	

}
