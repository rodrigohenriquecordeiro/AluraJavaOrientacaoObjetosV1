package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		Object cc = new ContaCorrente(1234, 454587);
		Object cp = new ContaPoupanca(4321, 969678);
		
		System.out.println(cc);
		System.out.println(cp);
	}

}
