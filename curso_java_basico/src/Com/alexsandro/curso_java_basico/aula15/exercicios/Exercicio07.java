package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int maior = 0;
		int menor = 1000;
		
		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número:");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			
			maior = num1;
		}
		
		else if (num2 >= num1 && num2 >= num3) {
			
			maior = num2;
		}
		
		else {
			
			maior = num3;
		}
		
		if (num1 <= num2 && num1 <= num3) {
			
			menor = num1;
		}
		
		else if (num2 <= num1 && num2 <= num3) {
			
			menor = num2;
		}
		
		else {
			
			menor = num3;
		}
		
		System.out.println("O maior número é " + maior);
		System.out.println("O menor número é " + menor);

	}

}
