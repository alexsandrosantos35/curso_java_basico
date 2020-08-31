package Com.alexsandro.curso_java_basico.aula25;

import Com.alexsandro.curso_java_basico.aula24.Carro;

public class TesteCarro1 {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducatto";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		//System.out.println(van);
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();

	}

}
