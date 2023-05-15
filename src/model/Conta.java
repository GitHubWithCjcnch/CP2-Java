package model;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;

public class Conta extends Sistema {
	private double saldo = 0;
	
	private ArrayList<String> transacoes = new ArrayList<String>();
	private ArrayList<String> investimentos = new ArrayList<String>();
	
	public Conta(String username, String senha) {
		super(username, senha);
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		Transacao transacao = new Transacao("Depósito", valor, "Depósito em conta", new Date());
		adicionarTransacao(transacao.mostrarInfoTransacao());
		}
	
	public void sacar(double valor) {
		if (this.getSaldo() < valor || this.getSaldo() <= 0) {
			System.out.println("Você não possui saldo suficiente para este saque.");
		} else {			
			this.saldo -= valor;
			Transacao transacao = new Transacao("Saque", valor, "Retirada em conta", new Date());
			adicionarTransacao(transacao.mostrarInfoTransacao());
		}
	}
	
	public void realizarInvestimento(String nome, double valorInvestimento, double taxa, String risco) {
		Timer timer = new Timer();
	    if (saldo < valorInvestimento) {
	        System.out.println("Você não possui saldo suficiente para este investimento.");
	    } else {
	        saldo -= valorInvestimento;
	        double rendimento = valorInvestimento * taxa;
	        TimerTask tarefa = new TimerTask() {
	        	public void run() {	                
	        		saldo += rendimento;
	            }
	        };
	        String infoInvestimento = String.format("Investimento: R$%.2f (Taxa: %.2f%%) - Rendimento: R$%.2f a cada 15 dias.", valorInvestimento, taxa * 100, rendimento);
	        adicionarInvestimento(infoInvestimento);
	        TipoInvestimento investimento = new TipoInvestimento(nome, valorInvestimento, taxa, "Investimento em conta", new Date());
	        adicionarInvestimento(investimento.mostrarInfoInvestimento());
	        timer.schedule(tarefa, (1000*86)*15, (1000*86)*15); // vai aplicar o investimento a cada 15 dias.
	        // Como o investimento não vai ter alterações em relação ao seu risco, o risco é fixo.
	    }
	}
	
	public void visualizarExtrato() {
		if (transacoes.isEmpty()) {
			System.out.println("Não há extratos.");
		} else {			
			for (String transacao: transacoes) {
				System.out.println(transacao);
			}
		}
	}
	
	public void visualizarInvestimentos() {
		if (investimentos.isEmpty()) {
			System.out.println("Não há investimentos.");
		} else {			
			for (String investimento: investimentos) {
				System.out.println(investimento);
			}
		}
	}
	
	public Conta buscarConta(String email) {
	    for (Conta conta: Sistema.getContas()) {
	        if (conta instanceof Usuario && ((Usuario) conta).getEmail().equals(email)) {
	            return conta;
	        }
	    }
	    return null;
	}
	
	private void adicionarInvestimento(String investimento) {
		investimentos.add(investimento);
	}

	private void adicionarTransacao(String transacao) {
		transacoes.add(transacao);
	}
}
