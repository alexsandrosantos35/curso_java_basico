package Com.alexsandro.curso_java_basico.aula26;

public class Carro2 {
	
	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capCombustivel;
	public double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é de " + capCombustivel * consumoCombustivel + " KMs");
	}
	
	double obterAutonomia() {
		
		System.out.println("O metodo obterAutonomia foi chamado");
		
		return capCombustivel * consumoCombustivel;
	}
	
}
