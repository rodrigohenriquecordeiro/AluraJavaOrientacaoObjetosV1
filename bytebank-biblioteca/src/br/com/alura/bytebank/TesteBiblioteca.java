package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {

		Conta c = new ContaCorrente(222, 45459);
		System.out.println("Ag�ncia: " + c.getAgencia());
		System.out.println("Conta: " + c.getNumero());
	}
}
