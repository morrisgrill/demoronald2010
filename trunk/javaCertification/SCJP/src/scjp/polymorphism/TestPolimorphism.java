package scjp.polymorphism;

public class TestPolimorphism {
	public static void main(String[] args) {
		
		PlayerPiece player = new PlayerPiece();
		
		Object o = player;
		GameShape shape = player;
		Animatable mover = player;
	}
}

