package sequencial;

import java.util.Scanner;

/*
 * Escreva um algoritmos para ler o sálario mensal 
 * atual de um funcionário e o 
 * percentualidade de reajuste e 
 * escrever o novo salário.
 */
public class exercicio5 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		 double Salariomensal, reajuste,novosalario;
		 System.out.println("Escreva o seu sálario atual ");
		 Salariomensal=leia.nextDouble();
		 System.out.println("Digite o valor do reajuste");
		 reajuste=leia.nextDouble();
		 novosalario=(Salariomensal*reajuste/100)+Salariomensal;
		 System.out.println("Novo salário é "+ novosalario);
	}

}
