package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aula {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Collections.sort(nomes, (s1, s2) -> s1.length() - s2.length());

		System.out.println(nomes);
		
	}
}
