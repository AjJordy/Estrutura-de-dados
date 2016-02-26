package MetodosDeOrdenacao;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;


public class main {

	public static void main(String[] args) {
		
		Random random = new Random();
//		int x = 10000;
//		int[] n = new int[x];
//		int[] crescente = new int[x];
//		int[] decrescente = new int[x];
		OrdenacaoInterna ordenacao = new OrdenacaoInterna();
//		long inicio1;
//		long inicio2;
//		long inicio3;
//		
//		
//		//SELECTION SORT		
//		
//		
//		for (int i = 0; i < n.length; i++){ 
//			n[i] = new SecureRandom().nextInt(100);
//			crescente[i] = i;
//			decrescente[i] = decrescente.length - 1 - i;
//		}	
//		System.out.println("Tempo do selection sort: ");
//		//System.out.println(Arrays.toString(n));
//		//Seleção aleatoria
//		inicio1 = System.currentTimeMillis();
//		ordenacao.selectionSort(n);
//		long fim1 = System.currentTimeMillis() - inicio1;
//		
//		//Seleção crescente 
//		inicio2 = System.currentTimeMillis();
//		crescente = ordenacao.selectionSort(crescente);
//		long fim2 = System.currentTimeMillis() - inicio2;
//		
//		//Seleção decrescente
//		inicio3 = System.currentTimeMillis();
//		decrescente = ordenacao.selectionSort(decrescente);
//		long fim3 = System.currentTimeMillis()- inicio3;
//		
//		
//		//System.out.println(Arrays.toString(n));
//		System.out.println("Tempo aleatório:"+fim1);
//		System.out.println("Tempo crescente:"+fim2);
//		System.out.println("Tempo decrescente:"+fim3);
//		System.out.println("");
//		
//		
//		// INSERTION SORT
//		
//		
//		for (int i = 0; i < n.length; i++){ 
//			n[i] = new SecureRandom().nextInt(100);
//			crescente[i] = i;
//			decrescente[i] = decrescente.length - 1 - i;
//		}		
//		
//		System.out.println("Tempo do insertion sort : ");
//		//System.out.println(Arrays.toString(n));
//		//Inserção aleratoria
//		inicio1 = System.currentTimeMillis();
//		ordenacao.insertionSort(n);
//		long fim4 = System.currentTimeMillis() - inicio1;
//		
//		//Seleção crescente 
//		inicio2 = System.currentTimeMillis();
//		crescente = ordenacao.insertionSort(crescente);
//		long fim5 = System.currentTimeMillis() - inicio2;
//		
//		//Seleção decrescente
//		inicio3 = System.currentTimeMillis();
//		decrescente = ordenacao.insertionSort(decrescente);
//		long fim6 = System.currentTimeMillis() - inicio3;
//		
//		//System.out.println(Arrays.toString(n));
//		System.out.println("Tempo aleatório:"+fim4);
//		System.out.println("Tempo crescente:"+fim5);
//		System.out.println("Tempo decrescente:"+fim6);
//		System.out.println("");
//		
//		
//		//BUBBLE SORT
//		
//		for (int i = 0; i < n.length; i++){ 
//			n[i] = new SecureRandom().nextInt(100);
//			crescente[i] = i;
//			decrescente[i] = decrescente.length - 1 - i;
//		}		
//		
//		System.out.println("Tempo do bubble sort: ");
//		//System.out.println(Arrays.toString(n));
//		//Inserção aleratoria
//		inicio1 = System.currentTimeMillis();
//		ordenacao.bubbleSort(n);
//		long fim7 = System.currentTimeMillis() - inicio1;
//		
//		//Seleção crescente 
//		inicio2 = System.currentTimeMillis();
//		crescente = ordenacao.bubbleSort(crescente);
//		long fim8 = System.currentTimeMillis() - inicio2;
//		
//		//Seleção decrescente
//		inicio3 = System.currentTimeMillis();
//		decrescente = ordenacao.bubbleSort(decrescente);
//		long fim9 = System.currentTimeMillis() - inicio3;
//		
//		//System.out.println(Arrays.toString(n));
//		System.out.println("Tempo aleatório:"+fim7);
//		System.out.println("Tempo crescente:"+fim8);
//		System.out.println("Tempo decrescente:"+fim9);
//		System.out.println("");
//		
//		
//		// SHELLSORT
//		
//		int[] vetor = new int[x];		
//		Random random = new Random();
//		for (int i = 0; i < vetor.length; i++)
//			vetor[i] = random.nextInt(100);		
//		vetor = ordenacao.shellSort(x , vetor);
//		System.out.println(Arrays.toString(vetor));
		
		//QUICKSORT
		int[] v = new int[10];
		random = new Random();		
		for (int i = 0; i < v.length; i++) 
			v[i] = random.nextInt(10) ;
		System.out.println("Pivo é: "+v[0]);
		System.out.println(Arrays.toString(v));
		v = ordenacao.separacaoMelhor(v);		
		System.out.println(Arrays.toString(v));
		
	}

}
