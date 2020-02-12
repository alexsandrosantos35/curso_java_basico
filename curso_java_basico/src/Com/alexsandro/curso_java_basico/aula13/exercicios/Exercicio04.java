package Com.alexsandro.curso_java_basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		double nota1 = scan.nextInt();
		
		System.out.println("Entre com a segunda nota:");
		double nota2 = scan.nextInt();
		
		System.out.println("Entre com a terceira nota:");
		double nota3 = scan.nextInt();
		
		System.out.println("Entre com a quarta nota:");
		double nota4 = scan.nextInt();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua média é " + media);


	}

}
