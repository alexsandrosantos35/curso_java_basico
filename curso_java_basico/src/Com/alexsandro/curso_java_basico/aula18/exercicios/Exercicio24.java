package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean palindromo = true;
		
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número:");
			vetorA[i] = scan.nextInt();
			
		}
		
		System.out.println("Vetor A:");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		for (int i=0; i<vetorA.length; i++) {
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		if (palindromo) {
			System.out.println("É palíndromo");
		}
		else {
			System.out.println("não é palíndromo");
		}

	}

}
