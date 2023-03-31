package sequencial;

import java.util.Scanner;

/*
 * Escreva um algoritmo para ler as dimensoes de um retangulo
 * (Base e Altura) depois calcule a sua Area.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		int A,b,h;
		System.out.println("---------------------------------------------");
		System.out.println("Vamos Calcular a Area do retangulo");
		System.out.println("----------------------------------------------");
		System.out.println("Digite a Base do Retangulo: ");
		b=leia.nextInt();
		System.out.println("Digite a altura do Retangulo: ");
		h=leia.nextInt();
		A=b*h;
		System.out.println("------------------------------------------------");
		System.out.println("O resultado da Area é: ");
		System.out.println(A);
		System.out.println("------------------------------------------------");
		

	}

}
