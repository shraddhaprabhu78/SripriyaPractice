package abstractDemo;

public abstract class Animal {
	
	void Breath()
	{
		System.out.println("Animals Takes breath");
	}
	
	void sleeps()
	{
		System.out.println("Animals Sleeps reguarly");
	}
	
	abstract void eats(); 
	abstract void shouts();
	
	

}
