package Com.alexsandro.curso_java_basico.aula24.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.marca = "G light";
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantia = 36;
		lampada.preco = 9.79;
		lampada.tempoVida = 18000;
		lampada.cor = "Branca";
		lampada.tipoLuz = "branca";
		lampada.tipoAbajour = true;
		lampada.tipo = new String[5];
		
		lampada.tipo[0] = "Abajour";
		lampada.tipo[1] = "Lampião";
		
		System.out.println(lampada.tipo[0]);

	}

}
