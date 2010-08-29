package scjp.Overriding.sample01;

public class TestOverriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Horse h 	= new Horse();
		h.eat();
		
		Animal a 	= new Horse();
		a.eat();
		
		Animal b 	= new Animal();
		b.eat();

	}

}
