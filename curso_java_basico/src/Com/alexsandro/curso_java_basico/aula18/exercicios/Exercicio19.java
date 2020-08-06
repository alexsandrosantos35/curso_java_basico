package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] alunos = new int[10];
		double[] notas1 = new double[alunos.length];
		double[] notas2 = new double[alunos.length];
		double[] result = new double[alunos.length];
		double soma = 0;
		double media = 0;
		String[] situacao = new String[10];
		
		for (int i=0; i<alunos.length; i++) {
			
				System.out.println("Entre com a nota 1 do aluno " + (i + 1));
				notas1[i] = scan.nextDouble();
				System.out.println("Entre com a nota 2 do aluno " + (i + 1));
				notas2[i] = scan.nextDouble();
				soma = (notas1[i] + notas2[i]);
				media = (soma / 2);
				result[i] = media;
				
			
			if (result[i] < 7) {
				situacao[i] = "Reprovado";
				}
			else {
				situacao[i] = "Aprovado";
			}
			}
		
		for (int i=0; i<alunos.length; i++) {
			System.out.println("Aluno " + (i + 1) + ": Media: " + result[i] + " Situação: " + situacao[i]);
		}

	}

}
