package packageFruits;

public abstract class Fruit {
	
	protected int poids;
	
	public Fruit() {
		System.out.println("Cr�ation de fruit");
	}
	
	public void affiche() {
		System.out.println("C'est un fruit");
	}
	
}
