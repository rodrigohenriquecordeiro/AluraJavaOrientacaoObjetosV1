public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100; 	//toda conta come�a com R$ 100,00
		System.out.println("Conta criada com sucesso");
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
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
	
	
}