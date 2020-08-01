package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número:");
		
		int num = scan.nextInt();

		System.out.println("Lista de números primos entre 1 e " + num);
		
		boolean primo = true;
		
		for (int i=2; i<num; i++) {
		primo = true;
			for (int j=2; j<i; j++) {
				if (i % j == 0) {
					primo = false;
				}

			}
			
			if (primo) {
				System.out.println(i + " é primo");
			}
		}
		

	}

}
