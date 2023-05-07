package br.com.bytebank.banco.testes.util;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		Integer idadeRef = 29;
		int primitivo = new Integer(21); //n�o � mais necess�rio iniciar dessa forma
		
		List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); 
        lista.add(primitivo); //autoboxing

        int i1 = lista.get(0);  //unboxing
        Integer i2 = lista.get(1);  //

        System.out.println(i1);  //29
        System.out.println(i2); //21
        
        Integer valorRef = Integer.valueOf(33); // delegando a cria��o para m�todo valueOf
        int valorPri = valorRef.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper

        System.out.println(valorPri); //33
        
        Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo referencia
        int iParseado2 = Integer.parseInt("44");  //parseando e devolvendo primitivo

        System.out.println(iParseado1); //42
        System.out.println(iParseado2); //44
        
        System.out.println(Integer.MAX_VALUE); // 2^31 - 1
        System.out.println(Integer.MIN_VALUE); //-2^31

        System.out.println(Integer.SIZE); // 32 bits
        System.out.println(Integer.BYTES); //4 Bytes
		
	}
}
