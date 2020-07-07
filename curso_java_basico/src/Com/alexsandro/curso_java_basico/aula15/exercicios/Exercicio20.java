package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int culpado = 0;
		
		System.out.println("Responda as perguntas com 1 para sim e 2 para não.");
		
		System.out.println("Telefonou para a vítima?");
		int pergunta = scan.nextInt();
		if (pergunta == 1) {
			culpado++;
		}
		
		System.out.println("Esteve no local do crime?");
		pergunta = scan.nextInt();
		if (pergunta == 1) {
			culpado++;
		}
		
		System.out.println("Mora perto da vítima?");
		pergunta = scan.nextInt();
		if (pergunta == 1) {
			culpado++;
		}
		
		System.out.println("Devia para a vítima?");
		pergunta = scan.nextInt();
		if (pergunta == 1) {
			culpado++;
		}
		
		System.out.println("Trabalho com a vítima?");
		pergunta = scan.nextInt();
		if (pergunta == 1) {
			culpado++;
		}
		
		switch(culpado) {
		
		case 1 : System.out.println("inocente");break;
		case 2 : System.out.println("suspeito");break;
		case 3 : System.out.println("cúmplice");break;
		case 4 : System.out.println("cúmplice");break;
		case 5 : System.out.println("culpado");break;
		default : System.out.println("Inválido");break;
		
		}
		

	}

}
