package model;

import java.util.Date;

public class Transacao {
	private String tipo;
	private double valor;
	private String descricao;
	private Date data;
	
	public Transacao(String tipo, double valor, String descricao, Date data) {
		this.tipo = tipo;
		this.valor = valor;
		this.descricao = descricao;
		this.data = data;
	}
	
	public String mostrarInfoTransacao() {
		return "________________________________________________" + System.lineSeparator() +
				"Tipo: " + this.getTipo() + System.lineSeparator() + 
				"Valor: " + this.getValor() + System.lineSeparator() +
				"Descrição: " + this.getDescricao() + System.lineSeparator() +
				"Feito em: " + this.getData() + System.lineSeparator() +
				"________________________________________________";
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
