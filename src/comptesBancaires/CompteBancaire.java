package comptesBancaires;

public abstract class CompteBancaire {
	
	private int code;
	protected float solde;
	private static int nbrComptes;

	public CompteBancaire() {
		CompteBancaire.nbrComptes++;
     	this.code = CompteBancaire.nbrComptes;
     	this.solde = 0;
	}
	
	public void verser(float mt) {
		this.solde+=mt;
	}
	
	public void retirer(float mt) {
		if (mt<this.solde) {
			this.solde-=mt;
		}  
	}
	
	public String toString() {
		return "Compte bancaire\nNumero: "+this.code+"\nSolde: "+this.solde;
	}
}
