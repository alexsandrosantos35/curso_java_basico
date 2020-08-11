package Com.alexsandro.curso_java_basico.aula20.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] matrizM = new int[3][3];
		int num = 0;
		int qtdPares = 0; 
		int qtdImpares = 0;
		
		for (int i=0; i<matrizM.length; i++) {
			for (int j=0; j<matrizM[i].length; j++) {
				System.out.println("Entre com um número:");
				matrizM[i][j] = scan.nextInt();
				
				if (matrizM[i][j] % 2 == 0) {
					qtdPares++;
				}
				else {
					qtdImpares++;
				}
			}
		}
		
		for (int i=0; i<matrizM.length; i++) {
			for (int j=0; j<matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("A quantidade de pares é " + qtdPares);
		System.out.println("A quantidade de ímpares é " + qtdImpares);

	}

}
