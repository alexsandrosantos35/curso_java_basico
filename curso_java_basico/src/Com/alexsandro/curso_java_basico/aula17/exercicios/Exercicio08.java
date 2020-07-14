package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int soma = 0;
		double media = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com um número para a soma");
			num = scan.nextInt();
			
			soma += num;
			media = soma / 5;
		} 
		System.out.println("A média é " + media);
	}

}
