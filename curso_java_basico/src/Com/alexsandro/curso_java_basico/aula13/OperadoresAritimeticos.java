package Com.alexsandro.curso_java_basico.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta � uma";
		String segundoNome = " string concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++);
		//Mesma coisa que
		//System.out.println(resultado);
		//resultado = resultedo + 1
		//resultado += 1;
		
		System.out.println(++resultado);
		//Mesma coisa que
		//resultado += 1;
		//System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);

	}

}
