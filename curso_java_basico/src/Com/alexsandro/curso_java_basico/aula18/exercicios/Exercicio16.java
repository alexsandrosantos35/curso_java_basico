package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		double media = 0;
		int soma = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		int qtdIgual = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor para a posição " + (i + 1));
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] < 15){
				soma += vetorA[i];
			}
			else if (vetorA[i] == 15){
				qtdIgual++;
			}
			else {
				somaMaior15 += vetorA[i];
				qtdMaior15++;
			}
			
		}
		
		media = somaMaior15 / qtdMaior15;
		
		System.out.println("Vetor A:");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("A soma dos elementos menores que 15 é " + soma);
		System.out.println("A quantidade de elementos iguais a 15 é de " + qtdIgual);
		System.out.println("A média dos elementos maiores que 15 é " + media);

	}

}
