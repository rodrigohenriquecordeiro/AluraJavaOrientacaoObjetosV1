package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 2222);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto cal = new CalculadorDeImposto();
		cal.registra(cc);
		cal.registra(seguro);
		
		System.out.println(cal.getTotalImposto());

	}	
}
