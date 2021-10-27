package comptesBancaires;

public class ComptePayant extends CompteBancaire {
	
	
	public ComptePayant() {
		super();
	}
	
	@Override
	public void verser(float mt) {
		this.solde = this.solde-(mt+(mt*5/100));
	}
	
	public void retirer(float mt) {
		this.solde-=mt+(5/100)*mt;
	}
	
	
	public String toString() {
		return "Solde: "+solde;
	}
}