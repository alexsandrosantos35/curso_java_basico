package Com.alexsandro.curso_java_basico.aula27;

public class Carro3 {
	
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
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
		
	}

}
