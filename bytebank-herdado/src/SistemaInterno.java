
public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Você pode logar no sistema");
		} else {
			System.out.println("Você não pode logar no sistema");
		}
		
	}
}
