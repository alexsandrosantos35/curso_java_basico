package Com.alexsandro.curso_java_basico.aula20.exercicios;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Random numRandom = new Random(); 
		int[][] nunsAleatorios = new int[4][4];
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;
		
		for (int i=0; i<nunsAleatorios.length; i++) {
			for (int j=0; j<nunsAleatorios[i].length; j++) {
				nunsAleatorios[i][j] = numRandom.nextInt(100);
				
				if (nunsAleatorios[i][j] > maior) {
					maior = nunsAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		for (int i=0; i<nunsAleatorios.length; i++) {
			for (int j=0; j<nunsAleatorios[i].length; j++) {
				System.out.print(nunsAleatorios[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("O maior número é " + maior + " na linha " + linha + ", na coluna " + coluna);

	}

}
