package Com.alexsandro.curso_java_basico.aula17;

public class Exercicio17 {

	public static void main(String[] args) {
		
		for (int i = 0; i  < 5; i++) {
			System.out.println("Valor de i " + i);
		}
		
		for (int i = 5; i  > 0; i--) {
			System.out.println("Valor de i " + i);
		}
		
		for (int i = 0, j = 10; i  < j; i++, j--) {
			System.out.println("i é = " + i + " j é = " + j);
		}
		
		int count = 0;
		for (; count < 10;) {
				System.out.println("Valor de count " + count);
				count += 2;	
		}
		
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("Valor de cont " + cont);
		}
		
		int soma = 0;
		for (int i = 1; i < 5; soma += i++);
			System.out.println("O valor da soma é " + soma);
		
			for (int i = 0; i < 5; i++)
			System.out.println("i tem valor " + i);

	}

}
