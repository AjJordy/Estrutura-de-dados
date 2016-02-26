
public class Item {
	private int id;
	private int chamado;
	private String frase;
	
	

	public Item(){
		
	}
	
	public Item(int id) {
		super();
		this.id = id;		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getChamado() {
		return chamado;
	}
	public void setChamado() {
		
	}
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public int compareTo(int id) {
        if (this.id < id) {
            return -1;
        }
        if (this.id > id) {
            return 1;
        }
        return 0;
    }
}
