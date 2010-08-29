package scjp.polymorphism;

class PlayerPiece extends GameShape implements Animatable {
	
	public void movePiece() {
		System.out.println("moving game piece");
	}

	//método implementado de la clase Animatable
	public void animate() {
		System.out.println("animating...");
	}
	// more code
}
