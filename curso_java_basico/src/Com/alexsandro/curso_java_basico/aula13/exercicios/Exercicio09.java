package Com.alexsandro.curso_java_basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os graus farenheit:");
		double farenheits = scan.nextDouble();
		
		double celsius = 5 * (farenheits - 32) / 9;
		
		System.out.println(farenheits + " graus farenheits são " + celsius + " graus celsius");

	}

}
