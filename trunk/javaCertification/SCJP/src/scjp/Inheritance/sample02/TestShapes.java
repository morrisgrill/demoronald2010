package scjp.Inheritance.sample02;

public class TestShapes {
	
	public static void main(String[] args) {
		
		PlayerPiece shape = new PlayerPiece();
		//invoca al m�todo heredado
		shape.displayShape();
		//invoca al m�todo propio
		shape.movePiece();
	}
	
}
