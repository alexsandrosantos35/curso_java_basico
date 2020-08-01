package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de N");
		int n = scan.nextInt();
		double h = 0;
		
		
		for (int i=1; i<=n; i++) {
			h += 1 / i;
		}
		
		System.out.println("Valor de H = " + h);


	}

}
