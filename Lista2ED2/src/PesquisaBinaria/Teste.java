package PesquisaBinaria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) throws IOException {
		PesquisaBinaria pb = new PesquisaBinaria();
//		int[] vetBin = {(2),(4),(6),(8),(10),(16),(17),(19),(21),(23)};
//		
//		//1)
//		int result = pb.buscaBinaria((vetBin.length-1)/2, 2, 0, vetBin.length-1,vetBin) + 1;		
//		System.out.println("Esta na "+result+"° posição");	
//		
//		//2)
//		int[] vetres = pb.buscaBinariaSoma((vetBin.length-1)/2, 0, vetBin.length -1, vetBin, 6);
//		System.out.println("A soma de "+Arrays.toString(vetres));
//		
		//3)
		Funcionario func = new Funcionario();
		Funcionario[] lista = new Funcionario[300];
		String caminho = JOptionPane.showInputDialog(null, "Imforme o caminho do arquivo:");
		String id = JOptionPane.showInputDialog(null, "Imforme o nome do funcionario:");
		FileReader fileReader = new FileReader(caminho);
		BufferedReader reader = new BufferedReader(fileReader);
		String data;
		int i=0;
		String[] temp = new String[3];
		while((data = reader.readLine()) != null){	
			if(i<3){
				temp = data.split(";");
				System.out.println(temp[0]);
				System.out.println(temp[1]);
				System.out.println(temp[2]);
				lista[i].setNome(temp[0]);
				lista[i].setCarga_horaria(Double.parseDouble(temp[1]));
				lista[i].setValor_hora(Double.parseDouble(temp[2]));
				i++;
			}			
		}		
		fileReader.close();
		reader.close();
		func = pb.retornaFuncionario(30, lista, id, (lista.length -1)/2,0, lista.length -1);
		JOptionPane.showMessageDialog(null, "Nome:"+func.getNome()+"\nCarga horaria: "+func.getCarga_horaria()+
				"\nValor hora: "+func.getValor_hora()+"\nSalario: "+func.getSalario());
		
		//C:\Users\Jordy\Desktop\funcionarios.txt
		//JORDY APARECIDO FARIA DE ARAUJO
	}	
}
