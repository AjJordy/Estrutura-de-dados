import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteTabela {
	public static void main(String[] args) throws IOException {
		Tabela t1 = new Tabela();
		Tabela t2 = new Tabela();
		Random randon = new Random();
		Item[] vet = new Item[25];
		Item[] vet2 = new Item[100];
		
		Item item = new Item();
		t1.inicializa(25);
		t2.inicializa(100);
		
//
//		// 4)
//		// 25 elementos
//		// do exercicio 1
//		// ordenado
//		double tempo = tempo = System.nanoTime();	
//		for (int i = 0; i < 25; i++) {
//			item.setId(i);
//			vet[i] = item;
//		}
//		t1.setRegistros(vet);
//		t1.buscaSequencial(5, 0,vet.length);
//		tempo = System.nanoTime() - tempo;
//		System.out.println("Tempo de 25 elementos do exercicio 1 ordenado é: "+tempo);
//
//		tempo = System.nanoTime();
//		// desordenado
//		for (int i = 0; i < 25; i++) {
//			item.setId(randon.nextInt(25));
//			vet[i] = item;
//		}
//		t1.setRegistros(vet);
//		t1.buscaSequencial(5, 0,vet.length);
//		tempo = System.nanoTime() - tempo;
//		System.out.println("Tempo de 25 elementos do exercicio 1 desordenado é: "+tempo);
//		
//		
//		// do exercicio 2
//		// ordenado
//		tempo = System.nanoTime();		
//		for (int i = 0; i < 25; i++) {
//			item.setId(i);
//			vet[i] = item;
//		}
//		t1.setRegistros(vet);
//		t1.buscaSequencial2(5, 0, vet.length);
//		tempo = System.nanoTime() - tempo;
//		System.out.println("Tempo de 25 elementos do exercicio 2 ordenado é: "+tempo);
//		
//		// desordenado
//		tempo = System.nanoTime();	
//		for (int i = 0; i < 25; i++) {
//			item.setId(randon.nextInt(25));
//			vet[i] = item;
//		}	
//		t1.setRegistros(vet);
//		t1.buscaSequencial(5, 0,vet.length);
//		tempo = System.nanoTime() - tempo;
//		System.out.println("Tempo de 25 elementos do exercicio 2 desordenado é: "+tempo);
//		
//		
//		
//		// 100 elementos
//		
//		// do exercicio 1
//		// ordenado
//		tempo = System.nanoTime() ;	
//		for (int i = 0; i < 100; i++) {
//			item.setId(i);
//			vet2[i] = item;
//		}
//		t2.setRegistros(vet2);
//		t2.buscaSequencial(5, 0,vet2.length);
//		tempo = System.nanoTime() - tempo;
//		System.out.println("Tempo de 100 elementos do exercicio 1 ordenado é: "+tempo);
//
//		// desordenado
//		tempo = System.nanoTime();
//		for (int i = 0; i < 100; i++) {
//			item.setId(randon.nextInt(100));
//			vet2[i] = item;
//		}
//		t2.setRegistros(vet2);
//		t2.buscaSequencial(5, 0, vet2.length);
//		tempo = System.nanoTime() - tempo;
//		System.out.println("Tempo de 100 elementos do exercicio 1 desordenado é: "+tempo);
//		
//		
//		// do exercicio 2
//		// ordenado
//		tempo = System.nanoTime() ;
//		for (int i = 0; i < 100; i++) {
//			item.setId(randon.nextInt(100));
//			vet2[i] = item;
//		}
//		t2.ordenar(vet2);
//		t2.buscaSequencial2(5, 0,vet2.length);
//		tempo = System.nanoTime() - tempo;
//		System.out.println("Tempo de 100 elementos do exercicio 2 ordenado é: "+tempo);
//		
//		// desordenado
//		tempo = System.nanoTime() ;
//		
//		for (int i = 0; i < 100; i++) {
//			item.setId(randon.nextInt(100));
//			vet2[i] = item;
//		}		
//		t2.buscaSequencial(5, 0,vet2.length);
//		tempo = System.nanoTime() - tempo;
//		System.out.println("Tempo de 100 elementos do exercicio 2 desordenado é: "+tempo);	
		
		//5)
		boolean ligado = true;
		String valor;
		int ocorrencia = 0;
		String caminho = JOptionPane.showInputDialog(null, "Imforme o caminho do arquivo:");
		String id = JOptionPane.showInputDialog(null, "Imforme o valor desejado:");
		FileReader fileReader = new FileReader(caminho);
		BufferedReader reader = new BufferedReader(fileReader);
		String data = null;
		while((data = reader.readLine()) != null){		  
		   ocorrencia = t1.buscaSequencial5(id,reader.readLine()!= null,data.split(" "), 0);
		}
		fileReader.close();
		reader.close();
		
		System.out.println(ocorrencia);	
	}

}
