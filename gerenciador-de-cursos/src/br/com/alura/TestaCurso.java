package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {

		Curso curso = new Curso("Banco de Dados", "Luis Souza");
		
		curso.adiciona(new Aula("Criando o primeiro Banco de Dados", 14));
		curso.adiciona(new Aula("Aprendendo a alterar Tabelas", 20));
		curso.adiciona(new Aula("Select", 18));
		
		System.out.println(curso.getAulas());
		
	}
}