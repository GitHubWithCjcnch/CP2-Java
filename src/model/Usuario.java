package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Usuario extends Conta {
	private int id;
	private String nome;
	private String email;
	private Date loginDate = new Date();
	private DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	private String dateFormatted = dateFormat.format(loginDate);
	
	public Usuario(String username, String senha, String nome, String email) {
		super(username, senha);
		this.nome = nome;
		this.email = email;
	}
	
	public void menuUsuario() {
		Scanner objInput = new Scanner(System.in);
		while(this.isUserLogged()) {
			System.out.println("_________________________________________________");
			System.out.println("Bem Vindo " + this.nome + "               Email: " + this.email);
			System.out.println("Saldo: " + this.getSaldo());
			System.out.println("");
			System.out.println("Selecione uma opção:");
            System.out.println("1 - Visualizar extrato de transações");
            System.out.println("2 - Visualizar meus investimentos");
            System.out.println("3 - Realizar transferência bancária");
            System.out.println("4 - Realizar pagamento de boleto");
            System.out.println("5 - Realizar investimento");
            System.out.println("6 - Acessar serviços de assessoria financeira");
            System.out.println("0 - Sair");
            System.out.println("_________________________________________________");
            int opcao = objInput.nextInt();
            
            switch(opcao) {
            	case 1:
            		
            		break;
            	case 2:
            		// visualizar extrato de transações
            		break;
            	case 3:
            		// realizar transferência bancária
            		break;
            	case 4:
            		// realizar pagamento de boleto
            		break;
            	case 5:
            		// realizar investimento
            		break;
            }
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String getDateFormatted() {
		return dateFormatted;
	}	
}
