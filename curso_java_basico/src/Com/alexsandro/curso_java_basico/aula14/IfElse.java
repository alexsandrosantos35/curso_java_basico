package Com.alexsandro.curso_java_basico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua idade:");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			
			System.out.println("� maior de idade!");
		}
		else {
			
			System.out.println("� menor de idade!");
		}

	}

}
