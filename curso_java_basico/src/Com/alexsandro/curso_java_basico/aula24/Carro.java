package Com.alexsandro.curso_java_basico.aula24;

public class Carro {
	
	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capCombustivel;
	public double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro � de " + capCombustivel * consumoCombustivel + " KMs");
	}

	


}
