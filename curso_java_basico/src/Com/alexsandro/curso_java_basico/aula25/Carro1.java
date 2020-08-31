package Com.alexsandro.curso_java_basico.aula25;

public class Carro1 {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é de " + capCombustivel * consumoCombustivel + " KMs");
	}

}
