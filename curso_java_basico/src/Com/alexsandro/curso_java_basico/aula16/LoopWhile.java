package Com.alexsandro.curso_java_basico.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1;
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while (i <= max) {
			System.out.println("O valor de i é: " + i);
			i++;
			
		}
		System.out.println("Valor de i " + i);
		
		do {
			i++; 
			System.out.println("O valor de i é: " + i);
		} while (i < 13);
		System.out.println("Valor de i " + i);
	}

}
