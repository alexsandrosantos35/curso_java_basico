package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o lado 01");
		double lado1 = scan.nextDouble();
		System.out.println("Entre com o lado 02");
		double lado2 = scan.nextDouble();
		System.out.println("Entre com o lado 03");
		double lado3 = scan.nextDouble();
		
		if (((lado1 + lado2) > lado3) || ((lado2 + lado3) > lado1)
		|| ((lado1 + lado3) > lado2)) {
			System.out.println(" � tri�ngulo!");
		}
		else {
			System.out.println("N�o � triangulo");
		}
			
		if (((lado1 == lado2) && (lado1 != lado3)) ||
				((lado1 == lado3) && (lado1 != lado2))
				|| ((lado2 == lado3) && (lado2 != lado1))) {
		System.out.println("Tri�ngulo is�celis");	
		}
		if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
			System.out.println("Tri�ngulo escaleno!");
		}
		if ((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)) {
			System.out.println("Tri�ngulo equil�tero!");
		}

	}

}
