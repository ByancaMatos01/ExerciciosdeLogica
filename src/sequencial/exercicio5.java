package sequencial;

import java.util.Scanner;

/*
 * Escreva um algoritmos para ler o s�lario mensal 
 * atual de um funcion�rio e o 
 * percentualidade de reajuste e 
 * escrever o novo sal�rio.
 */
public class exercicio5 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		 double Salariomensal, reajuste,novosalario;
		 System.out.println("Escreva o seu s�lario atual ");
		 Salariomensal=leia.nextDouble();
		 System.out.println("Digite o valor do reajuste");
		 reajuste=leia.nextDouble();
		 novosalario=(Salariomensal*reajuste/100)+Salariomensal;
		 System.out.println("Novo sal�rio � "+ novosalario);
	}

}
