package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é impar");
		}

	}

}
