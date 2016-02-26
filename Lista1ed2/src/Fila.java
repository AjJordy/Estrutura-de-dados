import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;


public class Fila {

	public static void main(String[] args) {
		int opcao = 0;
		String nome , senha, correntista=null,atendimentoEspecial = null;	
		boolean isCorrentista = false , isAtendimentoEspecial = false;
		Queue pneIdosoGestantes = new LinkedList();
		Queue correntistas = new LinkedList();
		Queue naoCorrentistas = new LinkedList();
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira a opção desejada:\n1 - Cadastrar;\n2 - Atender;\n3 - Mostrar lista;"));
		if(opcao == 1 ){
			
			nome = JOptionPane.showInputDialog("Digite seu nome;");
			senha = JOptionPane.showInputDialog("Digite seu nome;");
			correntista= JOptionPane.showInputDialog("Digite seu nome;");
			if(correntista == "s") isCorrentista = true;
			else if (correntista == "n") isCorrentista = false;		
			JOptionPane.showInputDialog("Digite seu nome;");
			if(atendimentoEspecial == "s") isAtendimentoEspecial = true;
			else if (atendimentoEspecial == "n") isAtendimentoEspecial = false;	
			
			Usuario user = new Usuario(nome, senha, isCorrentista, isAtendimentoEspecial); 
			if(user.isAtendimentoEspecial()){
				pneIdosoGestantes.add(user);
			}else if(user.isCorrentista()){
				correntistas.add(user);
			}else{
				naoCorrentistas.add(user);
			}
			
		}
		else if(opcao == 2){
			Usuario user = (Usuario) pneIdosoGestantes.poll();
			JOptionPane.showMessageDialog(null,user.getNome() +" e "+user.getSenha());
			Usuario user2 = (Usuario) correntistas.poll();
			JOptionPane.showMessageDialog(null,user2.getNome() +" e "+user2.getSenha());
			Usuario user3 = (Usuario) naoCorrentistas.poll();
			JOptionPane.showMessageDialog(null,user3.getNome() +" e "+user3.getSenha());
			Usuario user4 = (Usuario) naoCorrentistas.poll();
			JOptionPane.showMessageDialog(null,user4.getNome() +" e "+user4.getSenha());
		}
	}

}
