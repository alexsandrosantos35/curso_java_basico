package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean confirmacao = true;
		String nome = "";
		int idade = 0;
		double salario = 0;
		String sexo = "";
		String estado = "";
		
		System.out.println("Ficha de cadastro");
		
		while (confirmacao) {
			System.out.println("Nome:");
			nome = scan.next();
			
			if (nome.length() <= 3) {
				System.out.println("Precisa ter mais que 3 caracteres");
				confirmacao = true;
			}
			else {
				confirmacao = false;
			}
		}
		
		confirmacao = true;
		while (confirmacao) {
			System.out.println("Idade:");
			idade = scan.nextInt();
			
			if ((idade >= 0) && (idade <= 150) ) {
				confirmacao = false;
			}
			else {
				System.out.println("Precisa estar entre 0 e 150");
				confirmacao = true;
			}
		}
		
		confirmacao = true;
		while (confirmacao) {
			System.out.println("Salário:");
			salario = scan.nextDouble();
			
			if (salario < 1 ) {
				System.out.println("Precisa ser maior que 0");
				confirmacao = true;
			}
			else {
				confirmacao = false;
			}
		}
		
		confirmacao = true;
		while (confirmacao) {
			System.out.println("Sexo:");
			sexo = scan.next();
			
			if ((sexo.equalsIgnoreCase("f")) || (sexo.equalsIgnoreCase("m"))) {
				confirmacao = false;
			}
			else {
				System.out.println("Precisa ser m(masculino) ou f(feminino).");
				confirmacao = true;
			}
		}
		
		confirmacao = true;
		while (confirmacao) {
			System.out.println("Estado cívil:");
			estado = scan.next();
			
			if ((estado.equalsIgnoreCase("s")) || (estado.equalsIgnoreCase("c")) || 
					(estado.equalsIgnoreCase("v")) || (estado.equalsIgnoreCase("d"))) {
				confirmacao = false;
			}
			else {
				System.out.println("Precisa ser s(solteiro), c(casado), "
						+ "v(viúvo ou d(divorciado).");
				confirmacao = true;
			}
		}

	}

}
