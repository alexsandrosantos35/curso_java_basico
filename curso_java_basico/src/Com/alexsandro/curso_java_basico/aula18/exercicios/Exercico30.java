package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercico30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		int posiB = 0;
		int posiC = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre co um número para a posição " + (i + 1) + " do vetor A");
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				vetorB[posiB] = vetorA[i];
				posiB++;
			}
			else {
				vetorC[posiC] = vetorA[i];
				posiC++;
			}
		}
		
		System.out.println("Vetor A");
		
		System.out.println();
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}

		
		System.out.println();
		
		System.out.println("Vetor B");
		
		for (int i=0; i<posiB; i++) {
			System.out.print(vetorB[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("Vetor C");
		
		for (int i=0; i<posiC; i++) {
			System.out.print(vetorC[i] + ", ");
		}

	}

}
