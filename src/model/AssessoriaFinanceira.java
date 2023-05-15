package model;

import java.util.Scanner;

public class AssessoriaFinanceira extends Usuario {
	private String nome;
	private String email;
	private String cpf;
	private String telefone;

	public AssessoriaFinanceira(String username, String senha, String nome, String email, Scanner objInput) {
		super(username, senha, nome, email, objInput);	
	}
	
	public void calcularImpostos(Usuario usuario) {
		// Retirar 3% do salário do usuário conforme o seu saldo seja maior que 2500
		if (usuario.getSaldo() > 2500) {
			usuario.sacar(usuario.getSaldo() * 0.03);
		}
	}
	
	public void planejamentoInvestimentos(Usuario usuario) {
		// Não sabemos como aplicar este método que foi pedido na prova. Falta informações.
	}

	public void analisarRisco(Usuario usuario) {
	    double saldo = usuario.getSaldo();
	    if (saldo > 100000) {
	        System.out.println("Risco Baixo");
	    } else if (saldo > 10000) {
	        System.out.println("Risco Moderado");
	    } else {
	        System.out.println("Risco Alto");
	    }
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
