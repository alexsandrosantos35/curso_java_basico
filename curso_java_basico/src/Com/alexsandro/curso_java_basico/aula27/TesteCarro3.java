package Com.alexsandro.curso_java_basico.aula27;

public class TesteCarro3 {

	public static void main(String[] args) {
		
		Carro3 van = new Carro3();
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
		System.out.println("A autonômia do carro é de: "
		+ van.obterAutonomia() + "kms");
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel10 " + qtdCombustivel10 );
		System.out.println("qtdCombustivel15 " + qtdCombustivel15 );


	}

}
