package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		int impares = 0;
		double media = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor para a posi��o " + (i + 1));
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 != 0){
				soma += vetorA[i];
				impares++;
			}
		}
		
		media = soma / impares;
		
		System.out.println("Vetor A:");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("A soma dos elementos �mpares � " + soma);
		
		System.out.println("A m�diados elementos �mpares � igual a: " + media);


	}

}
