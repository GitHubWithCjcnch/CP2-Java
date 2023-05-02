package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
	private int cpf;
	private String nome;
	private int numeroConta;
	private String endereco;
	private double saldo;
	private List<String> transactionHistory = new ArrayList<String>();
	
	Date dataContaCriada = new Date();
	DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	String dateFormatted = dateFormat.format(dataContaCriada);

	public void saque(double qtd) {
		saldo -= qtd;
		System.out.println("Foram retirados -" + qtd + " do seu saldo. Total: " + saldo);
		
		transactionHistory.add(LocalDateTime.now() + " - Saque: " + Double.toString(qtd));
	}
	
	public void deposito(double qtd) {
		saldo += qtd;
		System.out.println("Foram adicionados +" + qtd + " ao seu saldo. Total: " + saldo);
		transactionHistory.add(LocalDateTime.now() + " - Saque: " + Double.toString(qtd));
	}
	
	public void historicoTransacoes() {
		System.out.println("Histórico de transações de " + nome);
		for (String transacao: transactionHistory) {
			System.out.println(transacao);
		}
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
