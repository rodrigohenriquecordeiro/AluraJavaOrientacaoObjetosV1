
// todos os m�todos de uma Interface s�o abstratos
// � como se fosse um contrato, quem assina precisa implementar os m�todos
// n�o podemos instanciar uma Interface
// n�o possui m�todo concreto
public abstract interface Autenticavel{

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
