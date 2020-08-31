package Com.alexsandro.curso_java_basico.aula24.exercicios;

import java.util.Date;

public class Exercicio04 {

	public static void main(String[] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.titulo = "20.000 léguas submarinas";
		livro.autor = "Julio Verne";
		livro.anoLancamento = 1866;
		livro.dataEntrega = new Date();
		livro.emprestado = true;
		
		System.out.println(livro.autor);
		System.out.println(livro.dataEntrega);

	}

}
