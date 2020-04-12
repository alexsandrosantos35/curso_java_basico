package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra(f ou m).");
		String input = scan.next();
		
		if (input.equalsIgnoreCase("f")) {
			
			System.out.println("Sexo feminino.");
		} 
		
		else if (input.equalsIgnoreCase("m")) {
			
			System.out.println("Sexo masculino.");
		}
		
		else {
			
			System.out.println("Sexo inválido.");
		}

	}

}
