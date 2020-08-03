package Com.alexsandro.curso_java_basico.aula18;

public class Arrays {

	public static void main(String[] args) {
		
		double temp001 = 31.3;
		double temp002 = 32;
		double temp003 = 33.7;
		double temp004 = 34;
		double temp005 = 33.1;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("A temperatura do primeiro dia " + temperaturas[0]);
		System.out.println("A temperatura do segundo dia " + temperaturas[1]);
		System.out.println("A temperatura do terceiro dia " + temperaturas[2]);
		
		System.out.println("Tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: " + temperaturas);
		System.out.println("Valores do array: ");
		
		
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("A temperatura do dia "+ (i + 1) + ": " + temperaturas[i]);
		} 
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		

	}

}
