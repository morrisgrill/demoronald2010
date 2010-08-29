package scjp.polymorphism;

import scjp.Inheritance.sample02.GameShape;

class PlayerPiece extends GameShape implements Animatable {
	public void movePiece() {
		System.out.println("moving game piece");
	}

	public void animate() {
		System.out.println("animating...");
	}
	// more code
}
