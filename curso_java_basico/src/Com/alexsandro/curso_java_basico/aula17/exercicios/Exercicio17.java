package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o número para o fatorial:");
		int num = scan.nextInt();
		int fatorial = 1;
		
		for (int i=num; i>0; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.print("= " + fatorial);
	}

}
