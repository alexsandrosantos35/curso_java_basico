package Com.alexsandro.curso_java_basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com lado do quadrado:");
		double lado = scan.nextDouble();
		
		double resultado = (lado * lado) * 2;
		
		System.out.println("O dobro da area do quadrodo é: " + resultado);

	}

}
