import java.util.LinkedList;

import javax.swing.JOptionPane;


public class Grafo3 {

	public static void main(String[] args) {
		String partida=null, chegada=null, destino=null;
		LinkedList percurso = new LinkedList();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas cidades deseja?"));
		String matriz[][] = new String[n][n];
		JOptionPane.showMessageDialog(null, "Digite primeiro o nome da cidade, depois a distancia, e 0 para nulo");
		for(int i = 0; i<n;i++){
			for(int j=0;j<n;j++){
				matriz[i][j] = JOptionPane.showInputDialog("Digite o valor: ");
			}
			JOptionPane.showMessageDialog(null, "Proxima cidade;");
		}
		
		for(int i = 0; i<n;i++){
			for(int j=0;j<n;j++){
				if(matriz[i][j] != "0")System.out.print(" "+matriz[i][j]+" ");
			}
			System.out.println("");
		}
		
		partida = JOptionPane.showInputDialog("Digite o ponto de partida: ");
		chegada = JOptionPane.showInputDialog("Digite o ponto de chegada: ");
		
		while(destino!=chegada){
			for(int i = 0; i<n;i++){
				destino = chegada;
				if(matriz[i][0] == destino){
					for(int j=0;j<n;j++){
						destino= matriz[i][j];
						percurso.add(chegada);						
					}
				}			
			}
		}
		
	}

}
