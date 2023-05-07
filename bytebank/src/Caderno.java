
public class Caderno {

	public static void main(String[] args) {
		
		System.out.println("Testando Exceções\n");
		CadernoTeste caderno = new CadernoTeste();
		try {
			caderno.Metodo();
		} catch(Exception ex) {
			System.out.println("Exceção Ativada");
			caderno.n2 = 3;
			caderno.Metodo();
		}
		
	}
}
