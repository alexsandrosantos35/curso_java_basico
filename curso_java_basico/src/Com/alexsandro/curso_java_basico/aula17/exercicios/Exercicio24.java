package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o pre�o do p�o:");
		double preco = scan.nextDouble();
		
		System.out.println("Panificadora P�o de Ontem - tabela de pre�os");
		
		for (int i=1; i<=50; i++) {
			System.out.println(i + " - " + (i * preco));
		}

	}

}
