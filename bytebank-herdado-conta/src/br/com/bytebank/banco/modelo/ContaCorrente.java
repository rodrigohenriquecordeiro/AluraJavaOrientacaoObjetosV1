package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	// Construtores não são herdados, por isso recriamos um com os mesmos parametros da Classe Super
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	// Estamos sobreescrevendo o método saca da classe Super para criar uma regra específica para a Classe ContaCorrente
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
	    double valorASacar = valor + 0.2;
	    super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}
}
