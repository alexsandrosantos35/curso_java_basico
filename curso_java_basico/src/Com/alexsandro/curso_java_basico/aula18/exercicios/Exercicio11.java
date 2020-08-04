package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[10];
		int pares = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor para a posição " + (i + 1));
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println("Vetor A:");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("Número de elementos pares: " + pares);

	}

}
