package Com.alexsandro.curso_java_basico.aula20.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char jogoVelha[][] = new char[3][3];
		char sinal = ' ';
		int jogada = 1, linha = 0, coluna = 0;
		boolean jogar = true, linhaValida = false,
		colunaValida = false, jogadaValida = false;
		
		System.out.println("Jogo da velha.");
		System.out.println("Jogador 1 = \"X\"");
		System.out.println("Jogador 2 = \"O\"");
		
		while (jogar) {
			if (jogada % 2 == 1) {
				System.out.println("Vez do jogador 1.");
				sinal = 'X';
				jogada++;
			}
			else {
				System.out.println("Vez do jogador 2.");
				sinal = 'O';
				jogada++;
			}
			
			System.out.println("Entre com a linha(1-2-3)  e a  coluna (1-2-3)");
			
			while (!linhaValida) {
				System.out.println("Entre com a linha:");
				linha = scan.nextInt();
				if ((linha == 1) || (linha == 2) || (linha == 3)) {
					linhaValida = true;
				}
				else {
					System.out.println("Linha inválida, tente novamente.");
				}
			}
			
			while (!colunaValida) {
				System.out.println("Entre com a linha:");
				linha = scan.nextInt();
				if ((linha == 1) || (linha == 2) || (linha == 3)) {
					linhaValida = true;
				}
				else {
					System.out.println("Linha inválida, tente novamente.");
				}
			}
			
		}
		

	}

}
