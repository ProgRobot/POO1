package gestionCompte;

public abstract class Compte implements ICompte {

	private int code;
	protected float solde;
	
	
	public Compte() {
		
	}
	
	public Compte(int code, float solde) {
		this.code = code;
		this.solde = solde;
	}
	
	public abstract void afficher();
	
	
	/*
	public final void verser(float mt) {
		this.solde+=mt;
	}
	
	public void retirer(float mt) {
		this.solde-=mt;
	}
	
	public float getSolde() {
		return solde;
	}
	*/
	
	public String toString() {
		return "Solde = "+this.solde+" Code = "+this.code;
	}

	@Override
	public void verser(float mt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirer(float mt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getSolde() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
