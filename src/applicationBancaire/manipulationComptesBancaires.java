package applicationBancaire;

import comptesBancaires.CompteBancaire;
import java.lang.System;

import comptesBancaires.ComptePayant;
import comptesBancaires.CompteSimple;

public class manipulationComptesBancaires {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TEST::Bank account management app
		
		CompteSimple CBS1;
		
		CBS1 = new CompteSimple(200);
		System.out.println(CBS1.toString());
		
		CBS1.verser(15);
		CBS1.retirer(5);
		
		System.out.println(CBS1.toString());
		
		CompteBancaire CBP1 = new ComptePayant();
		System.out.println(CBP1.toString());
		
		CBP1.verser(15);
		System.out.println(CBP1.toString());
		
	}
}
