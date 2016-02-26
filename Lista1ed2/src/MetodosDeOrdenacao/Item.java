package MetodosDeOrdenacao;


public class Item implements Comparable{
	
	int chave;	

	@Override
	public int compareTo(Object o) {
		Item item = (Item) o;
		if(chave < item.getChave()){
			return -1;
		}else if(chave > item.getChave()){
			return 1;
		}else{
			return 0;
		}
		
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}
	
	
}
