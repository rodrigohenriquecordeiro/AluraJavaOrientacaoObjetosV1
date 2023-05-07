
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Rodrigo Cordeiro");
		System.out.println("Nome: " + g1.getNome());
		g1.setCpf("390811528-07");
		System.out.println("CPF: " + g1.getCpf());
		g1.setSalario(4000.0);
		System.out.println("Salário: R$ " + g1.getSalario());
		g1.setSenha(121344);
		
		boolean autenticaConta = g1.autentica(121344);
		System.out.println("Senha confere? " + autenticaConta);
		
		System.out.println("Bonificação do Gerente: R$ " + g1.getBonificacao());
	}

}
