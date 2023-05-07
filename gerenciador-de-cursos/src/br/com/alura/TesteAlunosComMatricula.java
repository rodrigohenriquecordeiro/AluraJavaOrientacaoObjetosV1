package br.com.alura;

public class TesteAlunosComMatricula {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
        
        Aluno a1 = new Aluno("Rodrigo Cordeiro", 121344);
        Aluno a2 = new Aluno("Debora Correa", 459621);
        Aluno a3 = new Aluno("Luis Souza", 123654);
        Aluno a4 = new Aluno("Rafael de Oliveira Bonaldo", 789687);
        Aluno a5 = new Aluno("Erica Cristina", 597431);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);
        javaColecoes.matricula(a5);
        
        javaColecoes.getAlunos().forEach(alunos -> System.out.println(alunos));
        
	}
}
