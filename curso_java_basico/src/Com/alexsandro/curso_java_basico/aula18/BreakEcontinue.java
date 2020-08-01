package Com.alexsandro.curso_java_basico.aula18;

import java.util.Scanner;

public class BreakEcontinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com um início:");
		int inicio = scan.nextInt();
		
		System.out.println("Entre com um final:");
		int fim = scan.nextInt();
		
		for (int i=inicio; i<=fim; i++) {
			if (i % 7 == 0) {
				System.out.println("O valor de i " + i);
				break;
			}
		}*/
		
		
		/*for (int i=0; i<=4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i == 3) {
							break rotulo3;
						}
						System.out.println("Rótulo 03");
					}
					System.out.println("Rótulo 02");
				}
				System.out.println("Rótulo 01");
			}
		System.out.println(i);
		}*/
		
		System.out.println("Entre com um início:");
		int inicio = scan.nextInt();
		
		System.out.println("Entre com um final:");
		int fim = scan.nextInt();
		
		for (int i=inicio; i<=fim; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i " + i);
		}

	}

}
