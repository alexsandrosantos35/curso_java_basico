package Com.alexsandro.curso_java_basico.aula24.exercicios;

public class Exercicio05 {
	
	public static void main (String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta número " + conta.numero + " = " + conta.saldo );
		
	}

}
