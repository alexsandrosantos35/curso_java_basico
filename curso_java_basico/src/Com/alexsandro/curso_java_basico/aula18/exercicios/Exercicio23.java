package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean valida = true;
		
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número:");
			vetorA[i] = scan.nextInt();
				
			if (vetorA[i] % 2 != 0) {
					break;
			}
		}
		
		System.out.println("Vetor A:");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}

	}

}
