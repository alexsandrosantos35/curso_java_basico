package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a base:");
		int base = scan.nextInt();
		
		System.out.println("Entre com o expoente:");
		int expo = scan.nextInt();
		
		int resultado = base;
		
		for (int i=1; i<expo; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado " + resultado);

	}

}
