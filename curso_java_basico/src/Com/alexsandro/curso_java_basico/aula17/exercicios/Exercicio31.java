package Com.alexsandro.curso_java_basico.aula17.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o salário:");
		double salario = scan.nextDouble();
		double percentual = 1.5;
		DecimalFormat decimal = new DecimalFormat("###,###.##");
		
		salario =  salario + (salario / 100) * percentual;
		
		for (int i=1997; i<=2015; i++) {
			percentual *= 2;
			salario += (salario / 100) * percentual;
			System.out.println(i + " = " + decimal.format(salario) + " - " + percentual + "%");
		}
		
	}

}
