package packageFruits;

public class Orange extends Fruit {
	
	public Orange(int p) {
		poids = p;
		System.out.println("Cr�ation d'une orange de poids: "+this.poids);
	}
	
	public void affiche() {
		System.out.println("C'est une orange.");
	}
	
	public void affichePoids() {
		System.out.println("Le poids de l'orange est :"+this.poids+" grammes");
	}
	
}
