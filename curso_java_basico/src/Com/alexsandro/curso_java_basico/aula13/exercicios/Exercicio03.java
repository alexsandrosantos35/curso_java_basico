package Com.alexsandro.curso_java_basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero inteiro:");
		int numero1 = scan.nextInt();
		System.out.println();
		
		System.out.println("Entre com o segundo n�mero inteiro:");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma dois dois n�mero �: " + soma);
		

	}

}
