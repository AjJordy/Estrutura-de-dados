import java.util.Scanner;

public class Arvore2 {
	public static void main(String[] args){
		int valor;	
		No atual = null;
		No raiz = null;
		Scanner scan = new Scanner(System.in);
		valor = scan.nextInt();
		
		
		if(raiz == null){
			raiz = new No(valor);
			System.out.println("Arvore vazia;");
		}else{
			atual = raiz;
			while(atual!= null){
				if(atual.getEsquerda().getValor() < valor){
					No novo = new No(valor);
					atual.setEsquerda(novo);
				}else if(atual.getEsquerda().getValor() > valor){
					No novo = new No(valor);
					atual.setDireita(novo);
				}
			}
		}
		
		
	}	
	
	static class No {
		No esquerda;
		No direita;
		int valor;

		public No(int valor) {
			this.valor = valor;
		}

		public No getEsquerda() {
			return esquerda;
		}

		public void setEsquerda(No esquerda) {
			this.esquerda = esquerda;
		}

		public No getDireita() {
			return direita;
		}

		public void setDireita(No direita) {
			this.direita = direita;
		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}
		
		
	}
}
