package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cod, qtd;
		double total = 0;
		boolean valida = true;
		String output = "";
		
		do {
			System.out.println("Entre com o código e a quantidade do pedido:");
			System.out.println("Digite 00 para sair.");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			
			if (cod == 0 && qtd == 0) {
				valida = false;
			}
			else {
				
				if (cod == 100) {
					output += "Cachorro quente -> 1,20 " + qtd;
					output += " = " + (qtd * 1.2) + "\n";
					total += qtd * 1.2;
				}
				else if (cod == 101) {
					output += "Bauru simples -> 1,30 " + qtd;
					output += " = " + (qtd * 1.3) + "\n";
					total += qtd * 1.3;
				}
				else if (cod == 102) {
					output += "Bauru com ovo -> 1,50 " + qtd;
					output += " = " + (qtd * 1.5) + "\n";
					total += qtd * 1.2;
				}
				else if (cod == 103) {
					output += "Hamburger -> 1,20 " + qtd;
					output += " = " + (qtd * 1.2) + "\n";
					total += qtd * 1.2;
				}
				else if (cod == 104) {
					output += "Cheeseburger -> 1,50 " + qtd;
					output += " = " + (qtd * 1.2) + "\n";
					total += qtd * 1.2;
				}
				else if (cod == 105) {
					output += "Refrigerante -> 1,50 " + qtd;
					output += " = " + (qtd * 1.3) + "\n";
					total += qtd * 1.2;
				}
			}
				
			
		} while (valida);
		
		System.out.println(output);
		System.out.println("O total foi " + total);

	}

}
