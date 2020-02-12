package Com.alexsandro.curso_java_basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o raio do círculo:");
		double raio = scan.nextDouble();
		
		double area = 3.14 * (raio * raio);
		
		System.out.println("A area do círculo é: " + area);

	}

}
