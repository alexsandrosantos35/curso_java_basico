package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int idade = 0;
		double media = 0;
		
		System.out.println("Entre com o número de pessoas:");
		int numPessoas = scan.nextInt();
		
		for (int i=1; i<=numPessoas; i++) {
			System.out.println("Entre com a idade da pessoa " + i);
			idade = scan.nextInt();
			soma += idade;
		}
		media = soma / numPessoas;
		
		if ((media > 0) && (media <= 25) ) {
			System.out.println("Média do grupo: Jovem");
			
		}
		else if ((media > 25) && (media <= 60) ) {
			System.out.println("Média do grupo: Adulto");
			
		}
		else if ((media > 60)) {
			System.out.println("Média do grupo: Idoso");
			
		}
		

	}

}
