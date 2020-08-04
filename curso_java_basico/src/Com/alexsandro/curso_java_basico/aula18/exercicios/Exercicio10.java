package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		double[] vetorB = new double[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor " + (i + 1) + " de vetor A: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] % 2;
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

	}

}
