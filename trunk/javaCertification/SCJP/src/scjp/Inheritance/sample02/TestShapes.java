package scjp.Inheritance.sample02;

public class TestShapes {
	
	public static void main(String[] args) {
		
		PlayerPiece shape = new PlayerPiece();
		//invoca al método heredado
		shape.displayShape();
		//invoca al método propio
		shape.movePiece();
	}
	
}
