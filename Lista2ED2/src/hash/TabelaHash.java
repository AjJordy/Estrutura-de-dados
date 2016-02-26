package hash;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;


public class TabelaHash {
    
    private LinkedList[] tabela;
    private Integer[] tabelaInt; 
   
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
    
    public void insereEnderecamentoAberto(int chave){
        int posicao = hash(chave);
        while(tabelaInt[posicao] != null && posicao < tabelaInt.length){
            posicao++;
        }
        tabelaInt[posicao] = chave;               
    }
    
    public void insere(String chave){
        int posicao = hash(chave);
        LinkedList lista = tabela[posicao] ;
        if(!lista.contains(chave))
            lista.add(chave);
    }
    
    public Coordenada pesquisa(int chave){
        Coordenada c = new Coordenada();
        int posicao = hash(chave);
        c.setPosicao(posicao);
        LinkedList lista = tabela[posicao];
        c.setIndice(lista.indexOf(chave));       
        return c;        
    }
    
    public int pesquisaEnderecamentoAberto(int chave){        
        int posicao = hash(chave);
        if(tabelaInt[posicao] == chave)
            return posicao;        
        else{
            for (int i = posicao; i < tabelaInt.length; i++) {
                if(tabelaInt[i] == chave)
                return posicao;
            }
        }
        return -1;
    }
    
    
}