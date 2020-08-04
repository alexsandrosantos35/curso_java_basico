package Com.alexsandro.curso_java_basico.aula18.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int posiMaior = 0;
		int maior = idades[0];
		int posiMenor = 0;
		int menor = idades[0];
		
		for (int i=1; i<idades.length; i++) {
			System.out.println("Entre com a idade: ");
			idades[i] = scan.nextInt();
			
			if (idades[i] > maior) {
				maior = idades[i];
				posiMaior = i + 1;
			}
			else if (idades[i] < menor) {
				menor = idades[i];
				posiMenor = i + 1;
			}
		}
		
		System.out.println("O maior elemento é " + maior + " na posição " + posiMaior);
		System.out.println("O menor elemento é " + menor + " na posição " + posiMenor);

	}

}
