package sequencial;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia idade de uma pessoa expressa em ano, 
 * meses e dias e escreva idade dessa pessoa expressa em dias 
 */
public class Exercicio3 {

	public static void main(String[] args) {
	 Scanner leia=new  Scanner(System.in);
	 int idadeDias, mes,anos, resp;
	 System.out.println("Digite a sua idade ");
	 	anos=leia.nextInt();
	 	System.out.println("Digite quantos meses de idade voce tem  ");
	 	mes=leia.nextInt();
	 	System.out.println("Quantos dias voce tem: ");
	 	idadeDias=leia.nextInt();
	 	resp=(anos*365)+(mes*30)+idadeDias;
	 	System.out.println("Voce já viveu tudo isso em dias "+ resp);
	 
	 
	 

	}

}
