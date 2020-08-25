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
			linhaValida = false;
			colunaValida = false;
			jogadaValida = false;
			
			if (jogada % 2 == 1) {
				System.out.println("Vez do jogador 1.");
				sinal = 'X';
			}
			else {
				System.out.println("Vez do jogador 2.");
				sinal = 'O';
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
				System.out.println("Entre com a coluna:");
				coluna = scan.nextInt();
				if ((coluna == 1) || (coluna == 2) || (coluna == 3)) {
					colunaValida = true;
				}
				else {
					System.out.println("Coluna inválida, tente novamente.");
				}
			}
			
			linha--;
			coluna--;
			
			while (!jogadaValida) {
				if ((jogoVelha[linha ][coluna] != 'X') &&
						(jogoVelha[linha][coluna] != 'O')) {
					jogoVelha[linha][coluna] = sinal;
					jogada++;
					jogadaValida = true;
				}
				else {
					System.out.println("Jogada inválida, tente novamente.");
				}
			}
			
			if (((jogoVelha[0][0] == 'X') && (jogoVelha[0][1] == 'X') && (jogoVelha[0][2] == 'X')) ||
				((jogoVelha[1][0] == 'X') && (jogoVelha[1][1] == 'X') && (jogoVelha[1][2] == 'X')) ||
				((jogoVelha[2][0] == 'X') && (jogoVelha[2][1] == 'X') && (jogoVelha[2][2] == 'X')) ||
				((jogoVelha[0][0] == 'X') && (jogoVelha[1][0] == 'X') && (jogoVelha[2][0] == 'X')) ||
				((jogoVelha[0][1] == 'X') && (jogoVelha[1][1] == 'X') && (jogoVelha[2][1] == 'X')) ||
				((jogoVelha[0][2] == 'X') && (jogoVelha[1][2] == 'X') && (jogoVelha[2][2] == 'X')) ||
				((jogoVelha[0][0] == 'X') && (jogoVelha[1][1] == 'X') && (jogoVelha[2][2] == 'X')) ||
				((jogoVelha[0][2] == 'X') && (jogoVelha[1][1] == 'X') && (jogoVelha[2][0] == 'X'))) {
				System.out.println("O jogador 1 ganhou!");
				System.out.println();
				jogar = false;
			}
			
			else if (((jogoVelha[0][0] == 'O') && (jogoVelha[0][1] == 'O') && (jogoVelha[0][2] == 'O')) ||
					((jogoVelha[1][0] == 'O') && (jogoVelha[1][1] == 'O') && (jogoVelha[1][2] == 'O')) ||
					((jogoVelha[2][0] == 'O') && (jogoVelha[2][1] == 'O') && (jogoVelha[2][2] == 'O')) ||
					((jogoVelha[0][0] == 'O') && (jogoVelha[1][0] == 'O') && (jogoVelha[2][0] == 'O')) ||
					((jogoVelha[0][1] == 'O') && (jogoVelha[1][1] == 'O') && (jogoVelha[2][1] == 'O')) ||
					((jogoVelha[0][2] == 'O') && (jogoVelha[1][2] == 'O') && (jogoVelha[2][2] == 'O')) ||
					((jogoVelha[0][0] == 'O') && (jogoVelha[1][1] == 'O') && (jogoVelha[2][2] == 'O')) ||
					((jogoVelha[0][2] == 'O') && (jogoVelha[1][1] == 'O') && (jogoVelha[2][0] == 'O'))) {
					System.out.println("O jogador 2 ganhou!");
					System.out.println();
					jogar = false;
				}
			else if (jogada > 9) {
				jogar = false; 
				System.out.println("Empate!");
			}
			
			for (int i=0; i<jogoVelha.length; i++) {
				for (int j=0; j<jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}
			
		}
		

	}

}
