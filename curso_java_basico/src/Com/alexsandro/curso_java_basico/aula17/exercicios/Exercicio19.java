package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;
		double nota = 0;
		
		System.out.println("Entre com quantidade de notas a serem somadas:");
		int qtd = scan.nextInt();
		
		for (int i=0; i<qtd; i++) {
			System.out.println("Entre com a nota:");
			nota = scan.nextDouble();
			soma += nota;
		}
		media = soma / qtd;
		
		System.out.println("A média é " + media);

	}

}
