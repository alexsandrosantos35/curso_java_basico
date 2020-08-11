package Com.alexsandro.curso_java_basico.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner   scan = new Scanner(System.in);
		int qtdFilhos = 0;
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas:");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos da pessoa " + (i + 1));
			qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho " + (i+1));
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for (int i=0; i<nomesFilhos.length; i++) {
			System.out.println("A pessoa " + i + " Possui " + nomesFilhos[i].length + " filhos.");
			for (int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}

	}

}
