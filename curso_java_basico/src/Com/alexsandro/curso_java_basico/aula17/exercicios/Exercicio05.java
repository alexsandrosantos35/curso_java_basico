package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int paisA = 0;
		int paisB = 0;
		int anos = 0;
		
		System.out.println("Entre com a popula��o A");
		paisA = scan.nextInt();
		
		System.out.println("Entre com a popula��o B");
		paisB = scan.nextInt();
		
		while (paisA <= paisB) {
			paisA += (paisA / 100) * 3;
			paisB += (paisB / 100) * 1.5;
			anos++;
		}
		System.out.println("O pais A alca�ar� o pa�s B em " + anos + " anos.");

	}

}
