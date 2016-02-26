
public class Usuario {
	private String nome;
	private String senha;
	private boolean correntista;
	private boolean atendimentoEspecial;
	
	
	public Usuario(String nome, String senha, boolean correntista,
			boolean atendimentoEspecial) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.correntista = correntista;
		this.atendimentoEspecial = atendimentoEspecial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isCorrentista() {
		return correntista;
	}
	public void setCorrentista(boolean correntista) {
		this.correntista = correntista;
	}
	public boolean isAtendimentoEspecial() {
		return atendimentoEspecial;
	}
	public void setAtendimentoEspecial(boolean atendimentoEspecial) {
		this.atendimentoEspecial = atendimentoEspecial;
	}
	
	
}
