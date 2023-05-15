package model;

public class Boleto {
	private String codigo;
	private double valor;
	private String descricao;
	
	public String mostrarInfoTransacao() {
		return "________________________________________________" + System.lineSeparator() +
				"Código: " + this.getCodigo() + System.lineSeparator() + 
				"Valor: " + this.getValor() + System.lineSeparator() +
				"Descrição: " + this.getDescricao() + System.lineSeparator() +
				"________________________________________________";
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
