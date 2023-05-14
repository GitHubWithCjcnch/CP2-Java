package model;

public class Sistema {
	private static Conta[] contas = new Conta[100];
    private static int numContas = 0;
	private String username;
    private String senha;


	static boolean userLogged = false;
    
    public Sistema(String username, String senha) {
		this.username = username;
		this.senha = senha;
	}
    
    public static void addConta(Conta conta) {
    	if (conta != null) {		
    		contas[numContas] = conta;
    		numContas++;
    	}
    }
    
    public static void setUserLogged(boolean userLogged) {
    	Sistema.userLogged = userLogged;
    }
	
	public boolean login(String username, String senha) {
		if (username.equals(this.username) && senha.equals(this.senha)) {
			userLogged = true;
			System.out.println("Login Realizado com Sucesso");
			return true;
		}
		return false;
	}
	
	public boolean logout() {
		userLogged = false;
		return false;
	}
	
	
	public static void mostrarContas() {
		for (Conta conta: contas) {	
			System.out.println(conta);
			System.out.println("teste");
		}
	}
	
	public static boolean isUserLogged() {
		return userLogged;
	}
	
	public static Conta[] getContas() {
		return contas;
	}
	
	public static void setContas(Conta[] contas) {
		Sistema.contas = contas;
	}
}
