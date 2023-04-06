package abstractDemo;

public abstract class Dog extends Animal{

	public static void main(String[] args) {
		

	}

	@Override
	void eats() {
		System.out.println("Dog eats Bones ");
		System.out.println("CAt drinks Milk ");
	}

	@Override
	void shouts() {
		
		System.out.println("Dog shouts Bow-Bow");
		System.out.println("Cat shouts Meaw-Meaw");
	}

	abstract void pets();
	
}
