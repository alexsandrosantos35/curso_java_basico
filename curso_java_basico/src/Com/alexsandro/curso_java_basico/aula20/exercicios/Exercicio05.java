package Com.alexsandro.curso_java_basico.aula20.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[][][] diasHoras = new String[12][31][8];
		int dia = 0, hora = 0,mes= 0, opcao = -1; 
		boolean valida = true;
		
		System.out.println("Agenda");
		System.out.println("Opções:");
		System.out.println("1 - Criar/alterar");
		System.out.println("2 - consultar"); 
		System.out.println("0 - Sair");
		
		while (valida) {
			System.out.println("Entre com uma opção");
			opcao = scan.nextInt();
			
			if (opcao == 1) {
				System.out.println("Entre com o mês do compromisso:");
				mes   = scan.nextInt();
				System.out.println("Entre com o dia do compromisso:");
				dia = scan.nextInt();
				System.out.println("Entre com a hora do compromisso:");
				hora = scan.nextInt();
				
				System.out.println("Entre com o compromisso:");
				diasHoras[mes - 1][dia - 1][hora] = scan.next();
			}
			
			else if (opcao == 2) {
				System.out.println("Entre com o mês do compromisso:");
				mes   = scan.nextInt();
				System.out.println("Entre com o dia do compromisso:");
				dia = scan.nextInt();
				System.out.println("Entre com a hora do compromisso:");
				hora = scan.nextInt();
				
				System.out.println("Compromisso: " + diasHoras[mes - 1][dia - 1][hora]);
			}
			
			else if (opcao == 0) {
				valida = false;
			}
			
		}

	}

}
