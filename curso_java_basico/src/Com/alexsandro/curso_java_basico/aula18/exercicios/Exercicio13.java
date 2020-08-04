package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor para a posição " + (i + 1));
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 5 == 0){
				soma += vetorA[i];
			}
		}
		
		System.out.println("Vetor A:");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("A soma dos multiplos de 5 é igual a: " + soma);

	}

}
