package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double precoMorango = 0;
		double precoMaca = 0;
		double kiloMorango = 0;
		double kiloMaca = 0;
		int desconto = 0;
		double totalKilos = 0;
		double total = 0;
		
		System.out.println("Entre com a quantidade de morangos(kilos).");
		kiloMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de maçã(kilos).");
		kiloMaca = scan.nextDouble();
		
		if (kiloMorango > 5) {
			precoMorango = 2.20;
		}
		else {
			precoMorango = 2.50;
		}
		
		if (kiloMaca > 5) {
			precoMorango = 1.50;
		}
		else {
			precoMaca = 1.80;
		}
		totalKilos = kiloMorango + kiloMaca;
		total= totalKilos * (precoMorango +  precoMaca);
		
		
		if ((totalKilos > 8) || (total > 25)) {
			total = (total / 100) * 90;
		}
		
		System.out.println("Preço total: " + total);

	}

}
