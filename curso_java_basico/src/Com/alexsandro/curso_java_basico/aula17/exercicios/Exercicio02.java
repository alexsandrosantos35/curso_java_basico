package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean confirmacao = true;
		String usuario = "";
		String senha = "";
		
		while (confirmacao) {
			System.out.println("Defina um usuário e senha(Diferentes)");
			System.out.println("Usuário:");
			usuario = scan.next();
			System.out.println("Senha:");
			senha = scan.next();
			
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha e usuário inválidos, eles precisam ser diferentes");
				confirmacao = true;
			}
			else {
				confirmacao = false;
				System.out.println("Cadastro confirmando.");
			}
			
		}

	}

}
