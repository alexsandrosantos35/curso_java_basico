package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean primo = true;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre co um número para a posição " + (i + 1) + " do vetor A");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i=0; i<vetorA.length; i++) {
			for (int j=0; j<=vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j + " é par.");
				}
			}

			System.out.println();
		}
	}

}
