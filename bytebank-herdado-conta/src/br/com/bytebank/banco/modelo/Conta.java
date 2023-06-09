package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa uma conta no ByteBank
 * 
 * @author Rodrigo H. Cordeiro
 * @version 1.0
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Construtor para inicializar o objeto Conta a partir da ag�ncia e n�mero
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inv�lida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inv�lido");
        }
		
		System.out.println("Conta criada com sucesso");
	}
	
	public abstract void deposita(double valor); 

	/**
	 * Valor precisa ser menor ou igual ao saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        this.saldo -= valor;       
		}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
	    this.saca(valor);
	    destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode n�mero negativo no N�mero");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor negativo na Ag�ncia");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal () {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "N�mero: " + this.numero + ", Ag�ncia: " + this.agencia;
	}
	
	@Override
	public boolean equals(Object ref){

	    Conta outra = (Conta) ref;

	    if(this.agencia != outra.agencia){
	        return false;
	    }

	    if(this.numero != outra.numero){
	        return false;
	    }

	    return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
	        return Double.compare(this.saldo, outra.saldo);
	}
}
