package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int qtdMaior35 = 0;
		
		for (int i=0; i<idades.length; i++) {
			System.out.println("Entre com a idade: ");
			idades[i] = scan.nextInt();
			
			if (idades[i] > 35) {
				qtdMaior35++;
			}
		} 
		
		System.out.println("A quantidade de idades superiores a 35 anos é de " + qtdMaior35);

	}

}
