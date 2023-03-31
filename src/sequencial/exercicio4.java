package sequencial;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double Teleitores,vtB,vtN,vtV;
		double PB,PV, PN;
		System.out.println("Total de leitores ");
		Teleitores=leia.nextDouble();
		System.out.println("Total de votos brancos ");
		vtB=leia.nextDouble();
		System.out.println("Total de votos nulos ");
		vtN=leia.nextDouble();
		System.out.println("Total de votos validos ");
		vtV=leia.nextDouble();
		
		
		PB=vtB/100*Teleitores;
		PV=vtV/100*Teleitores;
		PN=vtN/100*Teleitores;
		System.out.println("O percentual de votos Brancos é "+PB);
		System.out.println("O percentual de votos Nulos é "+PN);
		System.out.println("O percentual de votos Validos  é "+PV);
		
		
	
	}

}
