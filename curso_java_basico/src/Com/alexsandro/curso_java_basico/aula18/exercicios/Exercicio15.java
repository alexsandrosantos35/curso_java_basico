package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		double percImpar = 0;
		double percPar = 0;
		int impar = 0;
		int par = 0;
		double media = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor para a posição " + (i + 1));
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] % 2 != 0){
				impar++;
			}
		}
		
		par = vetorA.length - impar;
		
		System.out.println("Vetor A:");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		//vetorA.length == 100%
		//par        ==     x 
		//x * vetorA.length == par * 100
		// x == (par * 100) / vetorA.length
		
		percPar = (par * 100) / vetorA.length;
		percImpar = 100 - percPar;
		
		System.out.println();
		
		System.out.println("O percentual de elementos ímpares é " + percImpar + "%");
		
		System.out.println("O percentual de elementos pares é " + percPar + "%");

	}

}
