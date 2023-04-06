package InterfacePractice;

public class CircleClass implements DrawableInterface,PaintInterface {

	@Override
	public void draw() {
		System.out.println("Draw Circle");
		
	}

	@Override
	public void paint() {
		System.out.println("Paint the circle");
		
	}

}
