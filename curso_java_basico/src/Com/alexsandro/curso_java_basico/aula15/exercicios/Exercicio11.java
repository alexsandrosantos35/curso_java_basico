package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int percentual = 0;
		double reajuste = 0;
		double salarioFinal = 0; 
		
		System.out.println("Entre com o seu salário:");
		double salario = scan.nextDouble();
		
		if (salario <= 280) {
			
			percentual = 20;
			reajuste = (salario / 100) * percentual;
			salarioFinal = salario + reajuste;
		}
		
		if (salario > 280 && salario <= 700) {
			
			percentual = 15;
			reajuste = (salario / 100) * percentual;
			salarioFinal = salario + reajuste;
		}
		
		if (salario > 700 && salario <= 1500) {
			
			percentual = 10;
			reajuste = (salario / 100) * percentual;
			salarioFinal = salario + reajuste;
		}
		
		if (salario > 1500) {
			
			percentual = 5;
			reajuste = (salario / 100) * percentual;
			salarioFinal = salario + reajuste;
		}
		
		System.out.println("Salário inicial: R$ " + salario);
		System.out.println("Percentual de reajuste de " + percentual + "%");
		System.out.println("Reajuste de R$ " + reajuste);
		System.out.println("Salário final de R$ " + salarioFinal);

	}

}
