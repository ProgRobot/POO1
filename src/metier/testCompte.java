package metier;

import java.util.Scanner;

public class testCompte {
	
	public static void main(String[] args) {
		
	
		
		Compte cp = new Compte();
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Montant à verser: ");
		
		float mt1 = clavier.nextFloat();
		
		cp.verser(mt1);
		
		System.out.println("Solde actuel: "+cp.getSolde());
		System.out.println("Montant à retirer: ");
		
		
		
		
		
	}

}
