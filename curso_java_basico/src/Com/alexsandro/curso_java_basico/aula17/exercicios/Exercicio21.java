package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtdAlunos = 0;
		int soma = 0;
		double media = 0;
		boolean valida = true;
		
		System.out.println("Entre com o n�mero de turmas:");
		int turmas = scan.nextInt();
		
		for (int i=1; i<=turmas; i++) {
			
			valida = true;
			do  {
				System.out.println("Entre o n�mero de alunos da turma: " + i);
				qtdAlunos = scan.nextInt();
				
				if (qtdAlunos  <= 40) {
					valida = false;
				}
				else {
					valida = true;
					System.out.println("N�mero de alunos inv�lido. Tente outra vez.");
				}
			} while (valida);
			soma += qtdAlunos;
		}
		
		media = soma / turmas;
		
		System.out.println("A m�dia de alunos por turma � de " + media);
			
	}

}
