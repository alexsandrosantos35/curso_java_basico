package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double temperatura;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		double soma = 0;
		double media = 0;
		String condicao = "";
		int i = 0;
		
		while (!condicao.equalsIgnoreCase("n")) {
			System.out.println("Entre com uma temperatura:");
			temperatura = scan.nextDouble();
			
			if (temperatura > maior) {
				maior =  temperatura;
			}
			
			if (temperatura < menor) {
				menor = temperatura;
			}
			
			soma += temperatura;
			i++;
			
			System.out.println("Deseja continuar? s(sim) n(não). ");
			condicao = scan.next();
		}
		
		media = soma / i;
		
		System.out.println("Maior temperatura:" + maior);
		System.out.println("Menor temperatura:" + menor);
		System.out.println("Média das temperaturas:" + media);
		

	}

}
