package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero para verificar:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i=2; i<num; i++) {
			if (num % i == 0) {
				System.out.println("N�o � primo; divisivel por " + i);
				primo = false;
			} 
		}
		if (primo) {
			System.out.println("� primo");
		}
		

	}

}
