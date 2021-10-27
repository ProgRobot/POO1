package comptesBancaires;

public class CompteSimple extends CompteBancaire{

	private float decouvert;
	
	public CompteSimple(float decouvert){
		super();
		this.decouvert = decouvert;
	}
	
	public void verser(float mt) {
		this.solde+=mt;
	}
	
	public void retirer(float mt) {
		if (mt - this.decouvert <= solde) {
			this.solde-=mt;
		}
	}
	
	public String toString() {
		return super.toString()+"Type simple \n"+"\n Decouvert: " ;	
	}
}
