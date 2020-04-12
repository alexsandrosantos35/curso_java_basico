package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o preço do prineiro produto:");
		double prod1 = scan.nextDouble();
		
		System.out.println("Entre com o preço do segundo produto:");
		double prod2 = scan.nextDouble();
		
		System.out.println("Entre com o preço do terceiro produto:");
		double prod3 = scan.nextDouble();
		
		if (prod1 <= prod2 && prod1 <= prod3) {
			
			System.out.println("Compre o produto um que custa R$" + prod1);
		}
		
		else if (prod2 <= prod1 & prod2 <= prod3) {
			
			System.out.println("Compre o produto dois que custa R$" + prod2);
		}
		
		else {
			
			System.out.println("Compre o produto três que custa R$" + prod3);
		}

	}

}
