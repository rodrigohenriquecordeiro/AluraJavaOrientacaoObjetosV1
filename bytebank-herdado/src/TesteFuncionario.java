
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Gerente();
		nico.setNome("Nico");
		nico.setCpf("123.456.789-78");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
