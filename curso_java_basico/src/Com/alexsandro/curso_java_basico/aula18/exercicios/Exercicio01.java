package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor " + (i + 1) + " de vetor A: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		
		System.out.println();
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Valor" + (i + 1) + "de vetor A: " + vetorA[i]);
		}
		
		System.out.println();
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Valor" + (i + 1) + "de vetor B: " + vetorB[i]);
		}

	}

}
