package Com.alexsandro.curso_java_basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os graus celsius:");
		double celsius = scan.nextDouble();
		
		double farenheit = (celsius * 9/5) + 32;
		
		System.out.println(celsius + " graus celsius são " + farenheit + " graus farenheit");

	}

}
