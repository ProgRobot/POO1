package comptesBancaires;

public class CompteEpargne extends CompteBancaire {
	
	private float tauxInteret;
	
	public CompteEpargne(){
		super();
		this.tauxInteret = 0;
	}
	
	public void calculInteret(float tauxInteret) {
		this.tauxInteret = tauxInteret;
		this.solde +=this.tauxInteret*this.solde;
	}

	@Override
	public String toString() {
		return super.toString()+" Type: Epargne\n"+this.tauxInteret;
	}
	
	
	

}
