package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double precoCd = 0;
		double soma = 0;
		double media =0;
		
		System.out.println("Entre com a quantidade de cds");
		int qtdCd = scan.nextInt();
		
		for (int i=0; i<qtdCd; i++) {
			System.out.println("Entre com o preço do cd:");
			precoCd =  scan.nextDouble();
			soma += precoCd;
		}
		
		media = soma / qtdCd;
		
		System.out.println("Foi gasto: R$ " + soma);
		System.out.println("Sendo em média por cd R$ " + media);

	}

}
