package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("Entre com o ano:");
		int ano = scan.nextInt();
		
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			System.out.println("Ano bissexto");
		}
		else {
			System.out.println("N�o � bissexto");
		}

	}

}
