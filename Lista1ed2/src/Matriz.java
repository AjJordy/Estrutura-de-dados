import java.util.Scanner;

import javax.swing.JOptionPane;


public class Matriz {

	public static void main(String[] args) {
		int tamanho;
		Scanner scan = new Scanner(System.in);
		tamanho = scan.nextInt();
		String matriz[][] = new String[tamanho][tamanho];
		for(int i = 0 ; i< tamanho; i++){
			for(int j = 0; j<tamanho;j++){
				if(i==(tamanho/2) && j == (tamanho/2)) matriz[i][j]="y";
				else if(i == j) matriz[i][j] = "1";				
				else if (i+j==tamanho-1) matriz[i][j] = "0";
				else matriz[i][j] = "x";
			}
		}
		for(int i = 0 ; i< tamanho ; i++){
			for(int j = 0; j<tamanho;j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
