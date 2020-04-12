package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro:");
		int num = scan.nextInt();
		
		if (num >= 0) {
			
			System.out.println(num + " é positivo.");
		}
		
		else {
			
			System.out.println( num + " é negativo");
		}

	}

}
