import java.util.Scanner;


public class Arvore1 {
	public static void main(String[] args){
		int valor;
		No raiz = new No(3);
		No atual = raiz;
		No no1 = new No(5);
		No no2 = new No(6);
		No no3 = new No(9);
		raiz.setEsquerda(no1);
		raiz.setDireita(no2);
		no2.setEsquerda(no3);
		
		Scanner scan = new Scanner(System.in);
		valor = scan.nextInt();
		
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
