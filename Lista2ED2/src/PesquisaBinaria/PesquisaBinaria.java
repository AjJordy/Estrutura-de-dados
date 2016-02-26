package PesquisaBinaria;

public class PesquisaBinaria {

		//Busca binaria 
		//1)
		public int buscaBinaria(int posicao,int id,int inicio,int fim,int[] vetor){				
			if(vetor[posicao] == id){
				return posicao;			
			}else if(vetor[posicao] > id){			
				fim = posicao-1;
				posicao = (fim+inicio/2)-1;
				return buscaBinaria(posicao,id,inicio,fim,vetor);
			}else if(vetor[posicao] < id){			
				inicio= posicao+1;
				posicao = (fim + inicio)/2;
				return buscaBinaria(posicao,id,inicio,fim,vetor);
			}else{
				return -1;
			}			
		}
		
		//2)
		public int[] buscaBinariaSoma(int posicao,int inicio,int fim,int[] vetor,int valor){		
			int[] v = new int[2];			
			if(vetor[posicao] > valor){			
				for (int i = 0; i < fim; i++) {
					for (int j = i+1; j < fim; j++) {
						if(vetor[i] + vetor[j] == valor){
							v[0] = vetor[i];
							v[1] = vetor[j];
						}
					}
				}
				fim = posicao-1;
				posicao = (fim+inicio/2)-1;
			}else if(vetor[posicao] < valor){			
				for (int i = inicio; i < vetor.length; i++) {
					for (int j = i+1; j < v.length; j++) {
						if(vetor[i] + vetor[j] == valor){
							v[0] = vetor[i];
							v[1] = vetor[j];
						}
					}
				}
				inicio= posicao+1;
				posicao = (fim + inicio)/2;
			}		
			return v;
		}

		//3)
		public Funcionario retornaFuncionario(int qtd, Funcionario[] lista, String nome,int posicao,int inicio,int fim){
			Funcionario func = new Funcionario();
			if(lista[posicao].getNome().equals(nome)){
				return func;			
			}else if(lista[posicao].getNome().compareTo(nome) > 0){			
				fim = posicao-1;
				posicao = (fim+inicio/2)-1;
				return retornaFuncionario(qtd, lista, nome, posicao, inicio, fim);
			}else if(lista[posicao].getNome().compareTo(nome) < 0){			
				inicio= posicao+1;
				posicao = (fim + inicio)/2;
				return retornaFuncionario(qtd, lista, nome, posicao, inicio, fim);
			}else{
				return null;
			}			
		}
}
