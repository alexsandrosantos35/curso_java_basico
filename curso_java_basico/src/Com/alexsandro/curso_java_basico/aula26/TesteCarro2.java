package Com.alexsandro.curso_java_basico.aula26;

public class TesteCarro2 {

	public static void main(String[] args) {
		
		Carro2 van = new Carro2();
		van.marca = "Fiat";
		van.modelo = "Ducatto";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonômia do carro é de: " + autonomia + "kms");
		System.out.println("A autonômia do carro é de: " + van.obterAutonomia() + "kms");

	}

}
