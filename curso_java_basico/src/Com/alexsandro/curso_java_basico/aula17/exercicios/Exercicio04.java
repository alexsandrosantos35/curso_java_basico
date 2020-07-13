package Com.alexsandro.curso_java_basico.aula17.exercicios;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int paisA = 80000;
		int paisB = 200000;
		int anos = 0;
		
		while (paisA <= paisB) {
			paisA += (paisA / 100) * 3;
			paisB += (paisB / 100) * 1.5;
			anos++;
		}
		System.out.println("O pais A alcaçará o país B em " + anos + " anos.");

	}

}
