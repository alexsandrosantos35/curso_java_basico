package Com.alexsandro.curso_java_basico.aula12;

import java.util.Scanner; 

public class LerDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite o seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("O seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite o seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("O seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("A sua idade �: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura �: " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estima��o:");
		
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		System.out.println("A sua idade �: " + idade);
		System.out.println("Sua quantidade de filhos �: " + qtdFilhos);
		System.out.println("A sua altura �: " + altura);
		System.out.println("Vo�� tem pet:" + temPet);
		//testando erro da master
		

	}

}
