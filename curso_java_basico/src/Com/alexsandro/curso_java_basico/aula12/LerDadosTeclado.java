package Com.alexsandro.curso_java_basico.aula12;

import java.util.Scanner; 

public class LerDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite o seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("O seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite o seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("O seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("A sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
		
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		System.out.println("A sua idade é: " + idade);
		System.out.println("Sua quantidade de filhos é: " + qtdFilhos);
		System.out.println("A sua altura é: " + altura);
		System.out.println("Voçê tem pet:" + temPet);
		//testando erro da master
		

	}

}
