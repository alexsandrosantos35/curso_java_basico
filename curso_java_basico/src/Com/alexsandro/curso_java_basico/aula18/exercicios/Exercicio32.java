package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre co um número para a posição " + (i + 1) + " do vetor A");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Tabuada de " + vetorA[i]);
			
			for (int j=1; j<=10; j++) {
				System.out.println(vetorA[i] + " X " + i + " = " + (vetorA[i] * j));
			}
			
			System.out.println();
		}

	}

}
