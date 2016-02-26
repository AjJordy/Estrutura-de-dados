package MetodosDeOrdenacao;


public class OrdenacaoInterna implements OrdenacaoInternaInterface{

	

	@Override
	public int[] selectionSort(int[] v) {
		int menor, posicao, aux;
		for (int i = 0; i < v.length-1; i++) {
			menor = v[i];
			posicao = i;
			for (int j = i+1; j < v.length; j++) {
				if(v[j]< menor){
					menor = v[j];
					posicao = j;
				}
			}
			aux = v[i];
			v[i] = menor;
			v[posicao] = aux;
		}
		return v;
	}
	
	public int[] selecaoDecrescente(int[] v) {
		int maior, posicao, aux;
		for (int i = 0; i < v.length-1; i++) {
			maior = v[i];
			posicao=i;
			for (int j = i+1; j < v.length; j++) {
				if(v[j] > maior){
					maior = v[j];
					posicao = j;
				}
			}
			aux = v[i];
			v[i] = maior;
			v[posicao] = aux;
		}
		return v;
	}

	@Override
	public int[] insercao(int[] v) {
		int aux;
		for (int i = 1; i < v.length;i ++) {
			aux = v[i];
			for (int j = i - 1; j >= 0 ; j--) {
				if(v[j] > aux){
					v[j+1]= v[j];
					v[j] = aux;
				}
			}
		}
		return v;		
	}
	
	//melhor que o insercao acima 
	public int[] insertionSort(int[] v){
		int aux;
		for (int i = 1; i < v.length;i ++) {
			int j = i - 1 ;
			aux = v[i];
			while(aux < v[j] && j>0){
				v[i] = v[j];
				v[j] = aux;				
				j--;				
			}
		}
		return v;
	}

	@Override
	public void mergeSort(Item[] itens) {
		
		
	}
	
	public int[] bubbleSort(int[] v){
		int aux;
		for (int i = 0; i < v.length - 1; i++) {			
			for (int j = 0; j < v.length-i-1; j++) {
				if(v[j] > v[j+1]){
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
			
		}
		return v;
	}
	
	public int[] mySort(int[] v){
		for (int i = 0; i < v.length - 1; i++) {
			int aux = v[i];
			for (int j = i+1; j < v.length; j++) {
				if(v[j]<aux){
					aux = v[j]; 
					v[j] = v[i];
					v[i] = aux;					
				}
			}
			
		}
		return v;
	}
	
	public static int[] shellSort(int n, int[] vetor){		
		int h = 1;	    
	    while(h < n)
	            h = h * 3 + 1;
	    h = h / 3;
	    int aux, j;
	    while (h > 0) {
	        for (int i = h; i < n; i++) {
	            aux = vetor[i];
	            j = i;
	            while (j >= h && vetor[j - h] > aux) {
	                vetor[j] = vetor[j - h];
	                j = j - h;
	            }
	            vetor[j] = aux;
	        }
	        h = h / 2;
	    }
	    return vetor;
	}
	
	public int[] quickSot(int[] v , int prim, int ult){
		//Dividir para conquistar		
		return v;
	}
	
	public int[] separacao(int[] v){
		int i=0, pivo ,j = 0,aux;				
		pivo = 0;
				
		for(j = 1; j<v.length ;j++){
			if(v[j] < v[pivo]){
				i++;
				aux = v[j];
				v[j] = v[i];
				v[i] = aux;				
			}			
		}
		aux = v[i];
		v[i] = v[pivo];
		v[pivo] = aux;
		return v;
	}

	public int[] separacaoMelhor(int[] v){
		int i = 1,j,pivo = 0,aux;	
				
		for(j = v.length-1; j>i ;j--){
			if(v[j] < v[pivo]){
				while(v[i] < v[pivo] && i<j)
					i++;				
				aux = v[j];
				v[j] = v[i];
				v[i] = aux;				
			}			
		}
		if(v[pivo]>v[i]){
			aux = v[i];
			v[i] = v[pivo];
			v[pivo] = aux;
		}		
		return v;
	}
}
