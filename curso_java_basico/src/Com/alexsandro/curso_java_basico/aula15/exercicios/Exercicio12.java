package Com.alexsandro.curso_java_basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double salarioBruto = 0;
		double hora = 0;
		int horaTrabalhada = 0;
		int percentual = 0;
		double salarioLiquido = 0;
		double ir = 0;
		double fgts = 0;
		double inss = 0;
		double descontos = 0;
		
		System.out.println("Entre com o valor da hora trabalhada:");
		hora = scan.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no mês:");
		horaTrabalhada = scan.nextInt();
		
		salarioBruto = hora * horaTrabalhada;
		
		if (salarioBruto <= 900) {
			percentual = 0;
		}
		
		else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentual = 5;
		}
		
		else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentual = 10;
		}
		
		else if (salarioBruto > 2500) {
			percentual = 20;
		}
		
		ir = (salarioBruto / 100) * percentual;
		fgts = (salarioBruto / 100) * 11; 
		inss = (salarioBruto / 100) * 10;
		descontos = ir + inss;
		salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto          : R$ " + salarioBruto);
		System.out.println("IR(" + percentual + "%)" + "           : R$ " + ir);
		System.out.println("INSS(10%)              : R$ " + inss);
		System.out.println("FGTS(11%)              : R$ " + fgts);
		System.out.println("Total de Descontos     : R$ " + descontos);
		System.out.println("Salário Líquido        : R$ " + salarioLiquido);
	}

}
