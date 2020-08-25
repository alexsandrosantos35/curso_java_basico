package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra:");
		String letra = scan.next();
		
		/*if (letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e")||
				letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")||
				letra.equalsIgnoreCase("u")) {
			
			System.out.println("Vogal");
		}
		
		else {
			
			System.out.println("Consoante");
		}*/
		
		if (letra.length() > 1) {
			
			System.out.println("Não é uma letra válida.");
			
			
		}
		
		else {
			
			switch(letra) {
			case "A": 
			case "E": 
			case "I": 
			case "O": 
			case "U":
			case "a": 
			case "e": 
			case "i": 
			case "o": 
			case "u": System.out.println("Vogal"); break;
			default:  System.out.println("Consoante");
			}
		}

	}

}
