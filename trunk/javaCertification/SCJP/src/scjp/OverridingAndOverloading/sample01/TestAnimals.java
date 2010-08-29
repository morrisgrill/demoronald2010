package scjp.OverridingAndOverloading.sample01;

public class TestAnimals {
	
	public static void main(String[] args) {
		
		Animal animal 			= new Animal();
		Animal animalCaballo 	= new Horse(); // Animal ref, but a Horse object
		animal.eat(); // Runs the Animal version of eat()
		animalCaballo.eat(); // Runs the Horse version of eat()
		
		//no se puede hacer lo siguiente:
		/** 
		 * 
		Animal c = new Horse();
		c.buck(); // Can't invoke buck();
				  // Animal class doesn't have that method
		*/
	}
}
