package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero:");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o primeiro n�mero:");
		double num2 = scan.nextDouble();
		
		if (num1 > num2) {
			
			System.out.println(num1 + " � o maior");
		}
		
		else {
			
			System.out.println(num2 + " � o maior");
		}

	}

}
