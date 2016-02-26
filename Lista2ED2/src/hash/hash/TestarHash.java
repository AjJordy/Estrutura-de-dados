package hash;

public class TestarHash {
	public static void main(String[] args) {
        Hash hash = new Hash();
        hash.inicializa(4);

        hash.insere(2);
        hash.insere(5);
        hash.insere(30);
        hash.insere(7);

        Coordenada c = hash.pesquisa(2);
        System.out.println("Posicao: "+c.getPosicao());
        System.out.println("Indice: "+c.getIndice());
        
        c = hash.pesquisa(5);
        System.out.println("Posicao: "+c.getPosicao());
        System.out.println("Indice: "+c.getIndice());  
        
       hash.remove(5);
       c = hash.pesquisa(5);
       System.out.println("Posicao: "+c.getPosicao());
       System.out.println("Indice: "+c.getIndice());
        
        
        c = hash.pesquisa(10);
        System.out.println("Posicao: "+c.getPosicao());
        System.out.println("Indice: "+c.getIndice());
        
    }

}
