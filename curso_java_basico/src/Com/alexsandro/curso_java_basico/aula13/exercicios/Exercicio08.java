package Com.alexsandro.curso_java_basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com quanto vo�� ganha por hora:");
		double hora = scan.nextDouble();
		
		System.out.println("Entre com as horas trabalhdas:");
		double horaTrabalhada = scan.nextDouble();
		
		double salario = hora * horaTrabalhada;
		
		System.out.println("Seu sal�rio � de R$" + salario);

	}

}
