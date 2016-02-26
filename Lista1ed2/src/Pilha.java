import java.util.Scanner;
import java.util.Stack;


public class Pilha {

	public static void main(String[] args) {
		int soma = 0,valor = 0;
		Stack<Integer> pilha = new Stack<Integer>();
		pilha.push(1);
		pilha.push(2);
		Scanner scan = new Scanner(System.in);
		
		while(valor >=0){
			valor = scan.nextInt();
			pilha.push(valor);
			while(!pilha.isEmpty()){
				soma += pilha.pop();
			}			
			pilha.push(soma);
			System.out.println(pilha.toString());
			soma = 0 ;
		}
		

	}

}
