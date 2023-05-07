package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.*;

public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao() ) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
		} 
	}
}
