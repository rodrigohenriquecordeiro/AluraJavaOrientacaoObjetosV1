package br.com.bytebank.banco.testes;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Mario";
		String novo = nome.replace("o", "a");
		System.out.println(novo);
		System.out.println(novo.toUpperCase());
		System.out.println(novo.toLowerCase());
		
		char c = nome.charAt(3);
		System.out.println(c);
		
		int pos = nome.indexOf("rio");
		System.out.println(pos);
		
		String sub = nome.substring(2);
		System.out.println(sub);
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
	}

}
