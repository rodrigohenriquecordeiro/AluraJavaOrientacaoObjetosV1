package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("lorem2.txt");
		
		pw.println("Rodrigo Henrique Cordeiro");
		pw.println("Aprendendo a Desenvolver com ajuda da Alura");
		
		pw.close();
	}

}
