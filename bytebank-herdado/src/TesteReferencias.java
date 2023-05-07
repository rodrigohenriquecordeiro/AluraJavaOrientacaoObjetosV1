
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(3000.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		System.out.println("Gerente\n"
				+ "Salário: R$" + g1.getSalario()
				+ "\nBonificação: R$" + controle.getSoma());
		
		ControleBonificacao controle2 = new ControleBonificacao();
		System.out.println();
		controle2.registra(ev);
		System.out.println("Editor de Vídeo\n"
				+ "Salário: R$" + ev.getSalario()
				+ "\nBonificação: R$" + controle2.getSoma());
		
		ControleBonificacao controle3 = new ControleBonificacao();
		System.out.println();
		controle3.registra(d);
		System.out.println("Designer\n"
				+ "Salário: R$" + d.getSalario()
				+ "\nBonificação: R$" + controle3.getSoma());
		
	}
}
