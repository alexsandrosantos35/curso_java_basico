package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean primo = true;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre co um número para a posição " + (i + 1) + " do vetor A");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i=0; i<vetorA.length; i++) {
			for (int j=1; j<=vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(vetorA[i] + " é divisível por " + j);
				}
			}

			System.out.println();
		}

	}

}
