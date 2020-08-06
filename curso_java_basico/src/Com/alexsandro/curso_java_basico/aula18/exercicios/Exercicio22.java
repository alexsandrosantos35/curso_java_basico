package Com.alexsandro.curso_java_basico.aula18.exercicios;

public class Exercicio22 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int perc0 = 0, perc1 = 0, zero = 0, um = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 1);
			
			if (vetorA[i] == 0) {
				zero++;
			}
		}
		
		um = vetorA.length - zero;
		
		System.out.println("Vetor A:");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		System.out.println();
		
		//100 == vetoA.length
		//x   == zero
		//x * vetorA.length == 100 * zero
		//x == (100 * zero) / vetorA.length
		
		perc0 = (100 * zero) /vetorA.length;
		perc1 = 100 - perc0;
		
		System.out.println("O percentual de zeros é de " + perc0 + "%");
		System.out.println("O percentual de uns é de " + perc1 + "%");
		

	}

}
