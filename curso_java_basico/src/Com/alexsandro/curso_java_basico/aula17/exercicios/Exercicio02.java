package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean confirmacao = true;
		String usuario = "";
		String senha = "";
		
		while (confirmacao) {
			System.out.println("Defina um usu�rio e senha(Diferentes)");
			System.out.println("Usu�rio:");
			usuario = scan.next();
			System.out.println("Senha:");
			senha = scan.next();
			
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha e usu�rio inv�lidos, eles precisam ser diferentes");
				confirmacao = true;
			}
			else {
				confirmacao = false;
				System.out.println("Cadastro confirmando.");
			}
			
		}

	}

}
