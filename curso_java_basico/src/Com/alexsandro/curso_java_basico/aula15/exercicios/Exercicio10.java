package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com seu turno, matutino(M), vespertino(V) ou noturno(N).");
		String turno = scan.next();
		
		switch(turno) {
		
		case "M": System.out.println("Bom dia!"); break;
		case "V": System.out.println("Boa tarde!"); break;
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Opção inválida");
		}

	}

}
