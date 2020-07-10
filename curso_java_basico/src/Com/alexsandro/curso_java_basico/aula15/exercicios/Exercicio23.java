package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tipoCarne = 0;
		int cartao = 0;
		double qtd = 0;
		double precoKilo = 0;
		double total = 0;
		
		System.out.println("Escolha apenas uma das opções");
		System.out.println("1 para Filé duplo");
		System.out.println("2 para Alcatra");
		System.out.println("3 para Picanha");
		tipoCarne = scan.nextInt();
		
		System.out.println("Entre com a quantidade(kgs)");
		qtd = scan.nextInt();
		
		System.out.println("Informe se possui o cartão 1(sim) 2(não)");
		cartao = scan.nextInt();
		
		if (tipoCarne == 1) {

			if (qtd <= 5) {
				precoKilo = 4.90;
			}
			else {
				precoKilo = 5.80;
			}
		}
		
		else if (tipoCarne == 2) {

			if (qtd <= 5) {
				precoKilo = 5.90;
			}
			else {
				precoKilo = 6.80;
			}
		}
		
		else if (tipoCarne == 3) {

			if (qtd <= 5) {
				precoKilo = 6.90;
			}
			else {
				precoKilo = 7.80;
			}
		}
		else {
			System.out.println("Opção inválida");
		}
		
		total = qtd * precoKilo;
		
		if (cartao == 1) {
			total = total - ((total / 100) * 5);
		}
		
		System.out.println("Total a pagar: " + total);
		
	}




	}

}
