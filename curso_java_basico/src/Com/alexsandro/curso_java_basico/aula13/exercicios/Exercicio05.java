package Com.alexsandro.curso_java_basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os metros para converter em cent�metros:");
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println(metros + " metros s�o " + centimetros + " cent�metros.");

	}

}
