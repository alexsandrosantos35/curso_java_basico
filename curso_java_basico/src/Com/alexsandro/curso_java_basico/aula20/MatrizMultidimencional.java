package Com.alexsandro.curso_java_basico.aula20;

public class MatrizMultidimencional {

	public static void main(String[] args) {
		
		int[][][] matrizTridimencional = new int[3][3][3];
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for (int i=0; i<matrizTridimencional.length; i++) {
			for (int j=0; j<matrizTridimencional[i].length; j++) {
				for (int k=0; k<matrizTridimencional[i][j].length; k++) {
					System.out.println("i = " + i + " - j = " + j + " -   k = " + k);
					matrizTridimencional[i][j][k] = (i+ j + k);
					soma += matrizTridimencional[i][j][k];
					
					if (matrizTridimencional[i][j][k] % 2 == 0) {
						somaPares += matrizTridimencional[i][j][k];
					}
					else if (matrizTridimencional[i][j][k] % 2 != 0) {
						somaImpares += matrizTridimencional[i][j][k];
					}
				}
			}
		}
		
		System.out.println("Soma total " + soma);
		System.out.println("Soma dos pares " + somaPares);
		System.out.println("Soma dos ímpares " + somaImpares);

	}

}
