package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Banco de Dados", 11);
		Aula a2 = new Aula("L�gica de Programa��o", 14);
		Aula a3 = new Aula("Orienta��o a Objetos", 23);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println(i+1 + "� " + aulas.get(i));
		}
		
		
	}
}