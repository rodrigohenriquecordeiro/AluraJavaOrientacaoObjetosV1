
public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Voc� pode logar no sistema");
		} else {
			System.out.println("Voc� n�o pode logar no sistema");
		}
		
	}
}
