package hash;

import java.util.LinkedList;

public class Hash {
	 private LinkedList[] tabela;	   
	    private int[] peso;
	    private int M;	    
	    
	    public void inicializa(int tam){
	        M = tam-1;
	        tabela = new LinkedList[tam];
	        
	        for (int i = 0; i < tam; i++) {
	            tabela[i] = new LinkedList();
	        }
	    }   
	   
	    
	    public int hash(int chave){
	        return chave%M;        
	    }
	    
	    public int hash(String chave){
	        int chaveInt=0;
	        int peso;
	        for (int i = 0; i < chave.length(); i++) {
	            peso = i+1;
	            chaveInt += (int) chave.charAt(i) * peso;
	        }
	        return hash(chaveInt);
	    }
	    
	    public void insere(int chave){
	        int posicao = hash(chave);
	        LinkedList lista = tabela[posicao] ;
	        if(!lista.contains(chave))
	            lista.add(chave);
	    }
	  
	    
	    public void insere(String chave){
	        int posicao = hash(chave);
	        LinkedList lista = tabela[posicao] ;
	        if(!lista.contains(chave))
	            lista.add(chave);
	    }
	    
	    public void remove(int chave){
	    	Coordenada c = new Coordenada();
	    	c =  pesquisa(chave);
	    	tabela[c.getPosicao()].remove(c.getIndice());	    	
	    }
	    
	    public Coordenada pesquisa(int chave){
	        Coordenada c = new Coordenada();
	        int posicao = hash(chave);
	        c.setPosicao(posicao);
	        LinkedList lista = tabela[posicao];
	        c.setIndice(lista.indexOf(chave));       
	        return c;        
	    }
	    
	    
}
