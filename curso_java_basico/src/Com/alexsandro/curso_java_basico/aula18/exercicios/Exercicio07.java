package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor " + (i + 1) + " de vetor A: ");
			vetorA[i] = scan.nextInt();
			System.out.println("Entre com o valor " + (i + 1) + " de vetor B: ");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
		System.out.println();

		System.out.println("Vetor A");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		System.out.println();

		System.out.println("Vetor B");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("Vetor C");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorC[i] + ", ");
		}

	}

}
