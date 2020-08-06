package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre co um número para a posição " + (i + 1));
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			}
			else {
				vetorB[i] = 0;
			}
		}
		
		System.out.println("Vetor A");
		
		System.out.println();
		
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
