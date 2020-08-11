package Com.alexsandro.curso_java_basico.aula20.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int[][] matrizM = new int[10][10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int i=0; i<matrizM.length; i++) {
			for (int j=0; j<matrizM[i].length; j++) {
				matrizM[i][j] = (int)Math.round(Math.random() * 9);
			}
		}
		
		for (int i=0; i<matrizM[5].length; i++) {
				if (matrizM[5][i] < menor ) {
					menor = matrizM[5][i];
				}
		}
		
		for (int i=0; i<matrizM.length; i++) {
			if (matrizM[i][7] > maior) {
				maior = matrizM[i][7];
			}
		}
		
		for (int i=0; i<matrizM.length; i++) {
			for (int j=0; j<matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("O menor número da linha 5 é " + menor);
		System.out.println("O maior número da coluna 7 é " + maior);

	}

}
