package Com.alexsandro.curso_java_basico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com sua idade:");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			
			System.out.println("É maior de idade!");
		}
		else {
			
			System.out.println("É menor de idade!");
		}*/
		
		//Barato < 10
		//10 < valor < 15 - pedir desconto
		//15 <= valor 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.println("Entre com o preço");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			
			System.out.println("Está barato, pode comprar");
		}
		
		else if (valor > 10 && valor < 15) {
			
			System.out.println("Voçê pode pedir um desconto");
		}
		
		else if (valor >= 15 && valor < 17) {
			
			System.out.println("Pode pesquisar mais");
		}
		
		else {
			
			System.out.println("Está muito caro");
		}

	}

}
