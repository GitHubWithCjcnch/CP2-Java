package model;

import java.util.Date;

public class TipoInvestimento {
	private String nome;
	private double taxaJuros;
	private Date data;
	private String descricao;
	private double valor;
	
	public TipoInvestimento(String nome, double taxaJuros, double valor, String descricao, Date data) {
		this.nome = nome;
		this.taxaJuros = taxaJuros;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public String mostrarInfoInvestimento() {
		return "________________________________________________" + System.lineSeparator() +
				"Nome da ação: " + this.getNome() + System.lineSeparator() + 
				"Taxa de juros: " + this.getTaxaJuros() + System.lineSeparator() + 
				"Valor: " + this.getValor() + System.lineSeparator() +
				"Descrição: " + this.getDescricao() + System.lineSeparator() +
				"Feito em: " + this.getData() + System.lineSeparator() +
				"________________________________________________";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
