package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[21];
		double cotacao = 0;
		DecimalFormat df = new DecimalFormat("###,###.##");

		System.out.println("Entre com a cotação do dollar de hoje");
		cotacao = scan.nextDouble();
		
		for (int i=1; i <vetorA.length; i++) {
			vetorA[i] = cotacao * i;
		}
		
		System.out.println("Valores do dollar");
		
		for (int i=1; i <vetorA.length; i++) {
			System.out.println("Dollar X " + i + "  = " + df.format(vetorA[i]));
		} 

	}

}
