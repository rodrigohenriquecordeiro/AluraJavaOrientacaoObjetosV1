
public class Caderno {

	public static void main(String[] args) {
		
		System.out.println("Testando Exce��es\n");
		CadernoTeste caderno = new CadernoTeste();
		try {
			caderno.Metodo();
		} catch(Exception ex) {
			System.out.println("Exce��o Ativada");
			caderno.n2 = 3;
			caderno.Metodo();
		}
		
	}
}
