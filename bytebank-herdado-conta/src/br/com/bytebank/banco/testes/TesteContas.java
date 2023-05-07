package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.*;

public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException{

        ContaCorrente conta = new ContaCorrente(1213, -454596);
        System.out.println(conta);
        
    }
}
