import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
		int valor;
		Scanner scan = new Scanner(System.in);
		valor = scan.nextInt();
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(1);
		lista.add(3);
		lista.add(5);
		lista.add(7);
		lista.add(9);
		
		if(lista.contains(valor)){
			System.out.println("Já contem o valor");
		}
		else{
			for(int i=lista.size()-1;i>=0;i--){
				
				if(lista.get(i) < valor){
					lista.add(i+1, valor);
					break;
				}				
				
			}
		}		
		System.out.println(lista.toString());

		
	}
}
