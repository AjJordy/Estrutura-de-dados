import java.util.LinkedList;


public class Lista2 {
	public static void main(String[] args) {
		int maior = 0, index = -1;
		LinkedList lista = new LinkedList();
		lista.add(4);
		lista.add(3);
		lista.add(2);
		lista.add(9);
		lista.add(8);
		if(lista.isEmpty()){
			System.out.println("Lista vazia;");			
		}else if(lista.size() == 1){
			System.out.println("Só um elemento;");
		}else{
			for(int i =0; i<lista.size();i++){
				if(maior < (int)lista.get(i)){
					maior = (int)lista.get(i);
					
					index = lista.indexOf(i);
				}
				
			}
			
			if(index == 0 ) System.out.println("Já é o primeiro elemento;");
			else{
				lista.addFirst(maior);				
			} 
		}
		System.out.println(lista.toString());
		
	}
}
