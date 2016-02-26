
public class Tabela {

	private Item[] registros;
	private int[] registros2;
	private int qtd , ocorrencia=0;
	
	// busca sequencial 
	// 1)
	public int buscaSequencial(int id, int posicao,int tamanho){
		if(registros[posicao].compareTo(id) == 0){
			registros[posicao].setChamado();
			ocorrencia++;
			return ocorrencia;
		}else{
			while(posicao+1 < tamanho){
				posicao++;
				return buscaSequencial(id, posicao, tamanho);				
			}
		}
		return -1;
	}
	
	//2)
	public int buscaSequencial2(int id, int posicao,int tamanho){
		if(registros[posicao].compareTo(id) == 0){
			registros[posicao].setChamado();
			ocorrencia++;
			return ocorrencia;
		}else{
			while(registros[posicao].getId() <= id){
				posicao++;
				return buscaSequencial(id, posicao, tamanho);				
			}
		}
		return -1;
	}
		
	
	//3)
	public int buscaSequencial3(int id, int posicao){
		if(registros[posicao].compareTo(id) == 0){
			registros[posicao].setChamado();
			reordenar(posicao);
			return posicao;
		}else
			return buscaSequencial3(id, ++posicao);
	}
	
	//5)
	public int buscaSequencial5(String id,boolean ligado,String[] entrada, int i){
		if(entrada[i].equals(id)){
			i++;
			ocorrencia++;
			return ocorrencia;
		}else{
			while(ligado){				
				return buscaSequencial5(id,ligado,entrada,i);				
			}
		}
		return -1;
	}
	
	
	
	public void inicializa(int tam){
		registros = new Item[tam];
		registros2 = new int[tam];
		qtd=0;
	}
	
	public int pesquisa(int id){		
		for (int i = 0; i < qtd; i++) {
			if(registros[i].compareTo(id) == 0){
				registros[i].setChamado();
				reordenar(i);
				return i;
			}
		}
		return -1;
	}	
	
	
	public boolean insercao(Item i){
		if( qtd< registros.length && pesquisa(i.getId()) == -1){
			registros[qtd++] = i;
			return true;
		}
		return false;
	}
	
	public boolean remocao(int id){
		int i = pesquisa(id);
		if(i != -1){
			registros[i] = registros[--qtd];
			return true;
		}
		return false;
	}

	public Item[] reordenar(int posicao){
		Item aux;
		for (int i = posicao-1; i >0; i--) {
			if (registros[i].getChamado() > registros[posicao].getChamado()) {
				aux = registros[i--];
				registros[i] = registros[posicao];
				registros[posicao] = aux;
				break;
			}
		}
		return registros;
	}
	
	public void setRegistros(Item[] registros){
		this.registros = registros;
	}
	
	
	// Oredenação 
	
	   public void ordenar(Item[] vetor)
	   {
	      ordenar(vetor, 0, vetor.length - 1);
	   }

	   private  void ordenar(Item[] vetor, int inicio, int fim)
	   {
	      if (inicio < fim)
	      {
	         int posicaoPivo = separar(vetor, inicio, fim);
	         ordenar(vetor, inicio, posicaoPivo - 1);
	         ordenar(vetor, posicaoPivo + 1, fim);
	      }
	   }

	   private  int separar(Item[] vetor, int inicio, int fim)
	   {
	      Item pivo = vetor[inicio];
	      int i = inicio + 1, f = fim;
	      while (i <= f)
	      {
	         if (vetor[i].getId() <= pivo.getId())
	            i++;
	         else if (pivo.getId() < vetor[f].getId())
	            f--;
	         else
	         {
	            Item troca = vetor[i];
	            vetor[i] = vetor[f];
	            vetor[f] = troca;
	            i++;
	            f--;
	         }
	      }
	      vetor[inicio] = vetor[f];
	      vetor[f] = pivo;
	      return f;
	}

}
