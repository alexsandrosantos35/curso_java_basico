package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o preço do pão:");
		double preco = scan.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - tabela de preços");
		
		for (int i=1; i<=50; i++) {
			System.out.println(i + " - " + (i * preco));
		}

	}

}
