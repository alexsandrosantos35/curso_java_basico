package Com.alexsandro.curso_java_basico.aula17.exercicios;

public class Exercicio23 {

	public static void main(String[] args) {
		
		double preco = 1.99;
		
		System.out.println("Loja quase dois - tabela de preços");
		
		for (int i=1; i<=50; i++) {
			System.out.println(i + " - " + (i * preco));
		}

	}

}
