package sequencial;

import java.util.Scanner;

/*
 * Escreva um Algoritmo para ler um valor e escrever na tela o seu antecessor 
 */
public class Exercicio1 {

	public static void main(String[] args) {
		int n, ant;
		Scanner leia=new Scanner(System.in);
		System.out.println("Digite o n�mero: ");
		n=leia.nextInt();
		ant=(n-1);
		System.out.println("O n�mero �: "+ n + " e o seu antecessor � "+ant);

	}

}
