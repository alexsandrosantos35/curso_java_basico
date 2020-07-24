package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int segundo = 1, primeiro = 1;
		int proximo = 0;
		
		System.out.println("Entre com o enésimo termo");
		n = scan.nextInt();
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i=3; i <n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo; 
			segundo = proximo;
			
			System.out.println(proximo);
		}
		

	}

}
