package PesquisaBinaria;

public class Funcionario {
	
	private String nome;
	private Double valor_hora;
	private Double carga_horaria;
	private Double salario ;	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor_hora() {
		return valor_hora;
	}
	public void setValor_hora(Double valor_hora) {
		this.valor_hora = valor_hora;
	}
	public Double getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(Double carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = this.carga_horaria*this.valor_hora;
	}
	
	

}
