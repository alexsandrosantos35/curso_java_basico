package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número para a tabuada.");
		int num = scan.nextInt();
		
		System.out.println("Tabuada de " + num);
		
		for (int i=0; i<=10; i++) {
			System.out.println(i + " X " + num + " = " + (num * i));
		}

	}

}
