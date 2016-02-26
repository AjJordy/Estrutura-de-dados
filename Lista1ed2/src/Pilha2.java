import java.util.Stack;


public class Pilha2 {

	public static void main(String[] args) {
		int menor1 = 10000000 , menor2 = 10000000 ;
		Stack<Integer> lista1 = new Stack<Integer>();
		Stack<Integer> lista2 = new Stack<Integer>();
		Stack<Integer> lista3 = new Stack<Integer>();
		lista1.add(1);
		lista1.add(3);
		lista1.add(5);
		lista2.add(2);
		lista2.add(4);
		lista2.add(6);
		System.out.println(lista1.toString());
		System.out.println(lista2.toString());
		
		while(!lista1.isEmpty() && !lista2.isEmpty() ){
			for(int i= 0 ; i<lista1.size();i++){
				if(lista1.get(i) < menor1){
					menor1 = lista1.remove(i);
				}
			}
			for(int i= 0 ; i<lista2.size();i++){
				if(lista2.get(i) < menor2){
					menor2 = lista2.remove(i);
				}
			}
			if(menor1 > menor2){
				lista3.push(menor2);
				lista3.push(menor1);
			}
			menor1 = 10000000 ;
			menor2 = 10000000 ;
		}
		System.out.println(lista3.toString());
	}

}
