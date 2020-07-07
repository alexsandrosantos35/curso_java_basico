package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String combustivel = "";
		int percentual = 0;
		double precoA = 1.90;
		double precoG = 2.50;
		double qtdLitros = 0;
		double totalAPagar = 0;
		double desconto = 0;
		double totalBruto = 0;
		
		System.out.println("Entre com o total de litros desejados: ");
		qtdLitros = scan.nextDouble();
		
		System.out.println("Escolha o combustivel G(gasolina) ou a(alcool).");
		combustivel = scan.next();
		
		if ((combustivel.equalsIgnoreCase("a")) || (combustivel.equalsIgnoreCase("g"))) {
			
		
		if (combustivel.equalsIgnoreCase("a")) {
			if(qtdLitros > 20) {
				percentual = 5;
				totalBruto = qtdLitros * precoA;
				
			}
			else {
				percentual = 3;
				totalBruto = qtdLitros * precoA;
			}
		}
		
		if (combustivel.equalsIgnoreCase("g")) {
			if(qtdLitros > 20) {
				percentual = 6;
				totalBruto = qtdLitros * precoG;

			}
			else {
				percentual = 4;
				totalBruto = qtdLitros * precoG;
			}
		}

		}
		else {
			System.out.println("Letra inválida.");
		}
		
		desconto = (totalBruto / 100) * percentual;
		totalAPagar = totalBruto - desconto;
		
		System.out.println("Total gasto: " + totalAPagar);

	}

}
