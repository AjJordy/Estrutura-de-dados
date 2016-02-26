import javax.swing.JOptionPane;


public class Vetor {

	public static void main(String[] args) {
		int tamanho, soma = 0 , media = 0 ,maisFrequente = 0 , mediana = 0, cont = 0, contmax = 0;
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int vetor[] = new int[tamanho];		
		for(int i = 0 ; i < tamanho; i++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado:"));
			soma += vetor[i];
		}	
		
		media = soma/tamanho;
		JOptionPane.showMessageDialog(null, "A média é: "+media);
		if(tamanho%2 == 0){
			JOptionPane.showMessageDialog(null, "Sem mediana porque é par;");
		}else{
			mediana = (tamanho/2) + 1;
			JOptionPane.showMessageDialog(null, "A mediana é: "+media);
		}
		
		for(int i = 0 ; i < tamanho; i++){
			for(int j=i; j<tamanho; j++){				
				if(vetor[i] == vetor[j]) cont++;
			}
			if(cont > contmax){				
				maisFrequente = vetor[i];
				contmax = cont;
			}
			cont = 0;
		} 
		JOptionPane.showMessageDialog(null, "O elemento mais frequente é: "+maisFrequente);
	}
}
