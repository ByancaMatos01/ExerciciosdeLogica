package sequencial;

import java.util.Scanner;

/*
 * Uma Revendedora de Carros usados Paga a Seus Funcionários Vendedores um sálario Fixo
 * por mes, mais uma comissao Fixa por carro vendidos e mais 5% sobre Total de vendas efetuadas 
 * 
 * 
 * Escreva um algoritmo que leia o número de Carros Vendidios, O valor Total de Vendas, 
 * O valor que ele recebe por cada Carro e O Salário Fixo e Calcule o Salário do mesmo.
 * 
 */
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int NCV,valrTotVend,vlrCarro,salFixo;
		double SalarioRcebe;
		int comissaofixa;
		double comissaoTotalvenda;
		int subtotal;
		
		
		System.out.println("Digite o número de carros Vendidos:  ");
		NCV=leia.nextInt();
		System.out.println("Digite o valor Total de Vendidos:  ");
		valrTotVend=leia.nextInt();
		System.out.println("Digite a comissao fixa ");
		comissaofixa=leia.nextInt();
		System.out.println("Digite o valor que ele rece por cada  carros Vendidos:  ");
		vlrCarro=leia.nextInt();
		System.out.println("Digite o seu salário fixo ");
		salFixo=leia.nextInt();
		
		subtotal=vlrCarro+comissaofixa;
		comissaoTotalvenda=valrTotVend*0.5;
		
		SalarioRcebe=(salFixo+subtotal+comissaoTotalvenda);
		
		System.out.println("O salário a receber será de "+SalarioRcebe);
		
		

	}

}
