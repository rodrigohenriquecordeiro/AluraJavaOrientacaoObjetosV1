
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println("Ag�ncia: " + conta.getAgencia());
		System.out.println("Conta: " + conta.getNumero());
		
		System.out.println("Testando Contador da Conta");
		Conta rodrigo = new Conta(1213, 145698);
		System.out.println("Ag�ncia: " + rodrigo.getAgencia());
		System.out.println("Conta: " + rodrigo.getNumero());
		
		Conta rafael = new Conta(5623, 96857);
		System.out.println("Ag�ncia: " + rafael.getAgencia());
		System.out.println("Conta: " + rafael.getNumero());
		
		System.out.println("Total de Contas: " + Conta.getTotal());
	}
}
