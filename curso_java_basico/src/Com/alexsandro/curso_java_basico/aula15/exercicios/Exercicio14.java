package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner ;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String conceito = "";
		String condicao = "";
		double notaFinal = 0;
		
		System.out.println("Entre com a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota:");
		double nota2 = scan.nextDouble();
		
		notaFinal = (nota1 + nota2) / 2;
		
		if (notaFinal > 9 && notaFinal <= 10) {
			conceito = "A";
			condicao = "Aprovado";
		}
		
		if (notaFinal > 7.5 && notaFinal <= 9) {
			conceito = "B";
			condicao = "Aprovado";
		}
		
		if (notaFinal > 6 && notaFinal <= 7.5) {
			conceito = "C";
			condicao = "Aprovado";
		}
		
		if (notaFinal > 4 && notaFinal <= 6) {
			conceito = "D";
			condicao = "Reprovado";
		}
		
		if (notaFinal > 0 && notaFinal <= 4) {
			conceito = "E";
			condicao = "Reprovado";
		}
		
		System.out.println("Nota final: " + notaFinal + " conceito " + conceito + " Condição " + condicao);

	}

}
