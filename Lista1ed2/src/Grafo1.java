import java.util.LinkedList;


public class Grafo1 {

	public static void main(String[] args) {		
		LinkedList listaA = new LinkedList();
		LinkedList listaB = new LinkedList();
		LinkedList listaC = new LinkedList();
		LinkedList listaD = new LinkedList();
		LinkedList listaE = new LinkedList();
		LinkedList listaF = new LinkedList();
		String matriz[][] = new String[6][6];
		for(int i = 0; i<6;i++){
			for(int j=0;j<6;j++){
				matriz[i][j] = "0";
			}
		}
		matriz[0][0] = "a";
		matriz[0][1] = "b";
		matriz[0][2] = "f";
		matriz[1][0] = "b";
		matriz[1][1] = "a";
		matriz[1][2] = "c";
		matriz[1][3] = "d";
		matriz[1][4] = "f";
		matriz[2][0] = "c";
		matriz[2][1] = "b";
		matriz[2][2] = "d";
		matriz[2][3] = "f";
		matriz[3][0] = "d";
		matriz[3][1] = "b";
		matriz[3][2] = "c";
		matriz[3][3] = "e";
		matriz[3][4] = "f";
		matriz[4][0] = "e";
		matriz[4][1] = "d";
		matriz[4][2] = "f";
		matriz[5][0] = "f";
		matriz[5][1] = "a";
		matriz[5][2] = "b";
		matriz[5][3] = "d";
		matriz[5][4] = "e";
		
		
		listaA.add("a");
		listaA.add("b");
		listaA.add("f");
		listaB.add("b");
		listaB.add("a");
		listaB.add("c");
		listaB.add("d");
		listaB.add("f");
		listaC.add("c");
		listaC.add("b");
		listaC.add("d");
		listaC.add("f");
		listaD.add("d");
		listaD.add("b");
		listaD.add("c");
		listaD.add("e");
		listaD.add("f");
		listaE.add("e");
		listaE.add("d");
		listaE.add("f");
		listaF.add("f");
		listaF.add("a");
		listaF.add("b");
		listaF.add("d");
		listaF.add("e");
		
		System.out.println("Matriz");
		for(int i = 0; i<6;i++){
			for(int j=0;j<6;j++){
				if(matriz[i][j] != "0")System.out.print(" "+matriz[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("\n\nLista\n\n");
		System.out.println(listaA.toString());
		System.out.println(listaB.toString());
		System.out.println(listaC.toString());
		System.out.println(listaD.toString());
		System.out.println(listaE.toString());
		System.out.println(listaF.toString());
	}

}
