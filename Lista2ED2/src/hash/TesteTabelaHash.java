/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

/**
 *
 * @author ufg
 */
public class TesteTabelaHash {
    
    public static void main(String[] args) {
        TabelaHash t = new TabelaHash();
        t.inicializa(4);

        t.insere(2);
        t.insere(5);
        t.insere(30);
        t.insere(7);

        Coordenada c = t.pesquisa(2);
        System.out.println("Posicao: "+c.getPosicao());
        System.out.println("Indice: "+c.getIndice());
        
        c = t.pesquisa(5);
        System.out.println("Posicao: "+c.getPosicao());
        System.out.println("Indice: "+c.getIndice());        
       
        
        c = t.pesquisa(10);
        System.out.println("Posicao: "+c.getPosicao());
        System.out.println("Indice: "+c.getIndice());

        
    }
    
    
}
