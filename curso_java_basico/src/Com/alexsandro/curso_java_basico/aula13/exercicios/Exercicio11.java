package Com.alexsandro.curso_java_basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre com o primeiro número inteiro:");
	int num1 = scan.nextInt();
	
	System.out.println("Entre com o segundo número inteiro:");
	int num2 = scan.nextInt();
	
	System.out.println("Entre com o número real:");
	double real = scan.nextDouble();
	
	int resultado1 = (num1 * 2) * (num2 / 2);
	double resultado2 = (num1 * 3) + real;
	double resultado3 = Math.pow(real, 3); 
	
	System.out.println("O dobro do primeiro vezes a metado do segundo é igual a: " + resultado1);
	System.out.println("A soma do triplo do primeiro com o terceiro: " + resultado2);
	System.out.println("O terceiro elevado ao cubo: " + resultado3 );

	}

}
