package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro n�mero:");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			
			System.out.println(num1 + " O primeiro � o maior n�mero.");
		}
		
		else if (num2 >= num1 && num2 >= num3) {
			
			System.out.println(num2 + " O segundo � o maior n�mero.");
		}
		
		else {
			
			System.out.println(num3 + "O terceiro � o maior n�mero.");
		}

	}

}
