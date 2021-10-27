package gestionCompte;

public final class CompteSimple extends Compte { //class final class ne peut etre hérité
	
	private float decouvert;
	private final float taux = 2; //Variable final ou constante  on as pas le droit  de la modifier
	
	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}
	
	@Override
	public void retirer(float mt) {
		if(mt<solde+decouvert)solde-=mt;
	}
	
	
	
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
