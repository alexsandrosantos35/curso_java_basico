package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero");
		int num2 = scan.nextInt();
		
		System.out.println("Escolha uma opera��o (+ - / *)");
		String operacao = scan.next();
		
		boolean valida = true;
		double resultado = 0;
		
		switch (operacao) {
		
		case "+" : resultado = num1 + num2 ; break;
		case "-" : resultado = num1 - num2 ; break;
		case "/" : resultado = num1 / num2 ; break;
		case "*" : resultado = num1 * num2 ; break;
		default : System.out.println("Sinal inv�lido.");
		valida = false;
		break;
		}
		if (valida) {
		System.out.println("Resultado: " + resultado);
		
		if (resultado % 2 == 0) {
			System.out.println("O resultado � par");
		}
		else {
			System.out.println("O resultado � impar");
		}
		if (resultado >= 0) {
			System.out.println("O resultado � positivo");
		}
		else {
			System.out.println("O resultado � negativo");
		}
		
		}

	}

}
