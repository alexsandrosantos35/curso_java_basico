package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		
		System.out.println("Entre com o início: ");
		int inicio = scan.nextInt();
		
		System.out.println("Entre com o final: ");
		int fim = scan.nextInt();
		
		for (int i = inicio; i < fim; i++) {
			System.out.println(i);
			
			soma += i;
		}
		System.out.println("A soma dos números é " + soma);

	}

}
