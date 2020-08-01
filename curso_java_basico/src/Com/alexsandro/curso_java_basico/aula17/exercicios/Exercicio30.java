package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com u número.");
		int num = scan.nextInt();
		
		System.out.println("Entre com o início da  tabuada.");
		int inicio = scan.nextInt();
		
		System.out.println("Entre com o final da  tabuada.");
		int fim = scan.nextInt();
		
		System.out.println("Tabuada de " + inicio + " até " + fim);
		
		if (inicio < fim) {
		
			for (int i=inicio; i<=fim; i++) {
				System.out.println(i + " X " + num + " = " + (num * i));
			}
		}
		else {
			System.out.println("Operação inválida.");
		}

		
	}

}
