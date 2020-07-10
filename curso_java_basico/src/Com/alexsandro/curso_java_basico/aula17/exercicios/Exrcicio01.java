package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exrcicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean confirmacao = true;
		int nota = 0;
		
		while (confirmacao) {
			System.out.println("Entre com uma nota entre 1 e 10");
			nota = scan.nextInt();
			if ((nota > 0) && (nota <=10)) {
				confirmacao = false;
				System.out.println("Obrigado!");
			}
		}

	}

}
