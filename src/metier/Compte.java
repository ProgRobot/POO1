package metier;

public class Compte {
	
	private int code;
	private float solde;
	
	public void verser(float mt) {
		solde+=mt;
	}
	
	public void retirer(float mt) throws Exception {
		if (mt>solde) throw new Exception("Solde insuffisant.");
		solde-=mt;
	}
	
	public float getSolde() {
		return this.solde;
	}
}
