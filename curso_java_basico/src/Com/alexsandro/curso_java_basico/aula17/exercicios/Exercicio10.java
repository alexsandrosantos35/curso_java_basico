package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o início: ");
		int inicio = scan.nextInt();
		
		System.out.println("Entre com o final: ");
		int fim = scan.nextInt();
		
		for (int i = inicio; i < fim; i++) {
			System.out.println(i);
		}
	}

}
