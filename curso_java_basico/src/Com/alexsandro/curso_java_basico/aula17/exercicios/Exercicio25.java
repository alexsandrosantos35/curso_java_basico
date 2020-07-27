package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double preco = 1;
		double dinheiro = 0;
		double trouco = 0;
		double total = 0;
		String output = "";
		int i = 1;
		
		while (preco != 0) {
				System.out.println("Entre com o preço do produto");
				preco = scan.nextDouble();
				
				output += "Produto " + i + " : R$ " + preco + "\n";
				total += preco;
				i++;
			
		}
		

		System.out.println("Entre com o valor em dinheiro:");
		dinheiro = scan.nextDouble();
		
		trouco = dinheiro - total;
		
		output += "Total: R$ " + total + "\n";
		output += "Dinheiro: R$ " + dinheiro + "\n";
		output += "Troco: R$ " + trouco + "\n";
		
		System.out.println(output);

	}

}
