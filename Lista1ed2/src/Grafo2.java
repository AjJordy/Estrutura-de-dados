import javax.swing.JOptionPane;


public class Grafo2 {

	public static void main(String[] args) {
		
		int no = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos nós: "));
		String matriz[][] = new String[no][no];
		JOptionPane.showMessageDialog(null, "Digite primeiro o nó depois os valores, e 0 para nulo;");
		for(int i = 0; i<no;i++){
			for(int j=0;j<no;j++){				
				matriz[i][j] = JOptionPane.showInputDialog("Digite o valor: ");
			}
			JOptionPane.showMessageDialog(null, "Proximo nó;");
		}
		
		for(int i = 0; i<no;i++){
			for(int j=0;j<no;j++){
				if(matriz[i][j] != "0")System.out.print(" "+matriz[i][j]+" ");
			}
			System.out.println("");
		}
			

	}

}
