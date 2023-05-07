
// todos os métodos de uma Interface são abstratos
// é como se fosse um contrato, quem assina precisa implementar os métodos
// não podemos instanciar uma Interface
// não possui método concreto
public abstract interface Autenticavel{

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
