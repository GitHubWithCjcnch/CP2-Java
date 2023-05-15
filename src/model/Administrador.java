package model;
import java.util.Scanner;


public class Administrador extends Conta {
	private Scanner objInput;
	private String username;
	private String senha;
	private boolean isLogado;
	public Administrador(String username, String senha, Scanner objInput) {
		super(username, senha);
		this.objInput = objInput;
	}
	
	public void exibirMenu() {
		setLogado(true);
		while(Sistema.isUserLogged()) {
			System.out.println("--------------------------------------------------");
			System.out.println("Bem Vindo Administrador" );
			System.out.println("");
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Visualizar todas as contas do sistema");
			System.out.println("2 - Visualizar todas as contas do sistema");
            System.out.println("0 - Sair");
            System.out.println("--------------------------------------------------");
            int opcao = objInput.nextInt();
            
            switch(opcao) {
            	case 0:
            		this.logout();
            		setLogado(false);
            		break;
            	case 1:
            		Sistema.mostrarContas();
            		break;
            	case 2:
            		System.out.println("SISTEMA NÃO IMPLEMENTADO!");
            		break;
           }
		}
	}
	
	public void bloquearConta(Conta conta) {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isLogado() {
		return isLogado;
	}

	public void setLogado(boolean isLogado) {
		this.isLogado = isLogado;
	}
}
