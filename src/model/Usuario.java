package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Usuario extends Conta {
	private int id;
	private Scanner objInput;
	private String nome;
	private String email;
	private String cpf;
	private boolean isLogado;
	private Date loginDate = new Date();
	private DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	private String dateFormatted = dateFormat.format(loginDate);
	
	public Usuario(String username, String senha, String nome, String email, Scanner objInput) {
		super(username, senha);
		this.nome = nome;
		this.objInput = objInput;
		this.email = email;
	}
	
	public void exibirMenu() {
		setLogado(true);
		while(Sistema.isUserLogged()) {
			System.out.println("--------------------------------------------------");
			System.out.println("Bem Vindo " + this.nome + "               Email: " + this.email);
			System.out.println("Saldo: " + this.getSaldo());
			System.out.println("");
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Depósitar/Sacar dinheiro");
            System.out.println("2 - Visualizar extrato de transações");
            System.out.println("3 - Realizar transferência bancária");
            System.out.println("4 - Realizar investimento");
            System.out.println("5 - Visualizar meus investimentos");
            System.out.println("6 - Acessar serviços de assessoria financeira");
            System.out.println("0 - Sair");
            System.out.println("--------------------------------------------------");
            int opcao = objInput.nextInt();
            
            switch(opcao) {
            	case 0:
            		this.logout();
            		setLogado(false);
            		break;
            	case 1:
            		System.out.println("Selecione uma opção:");
        			System.out.println("1 - Depositar dinheiro");
                    System.out.println("2 - Sacar dinheiro");
                    opcao = objInput.nextInt();
                    if (opcao == 1) {
                    	System.out.println("Qual o valor de depósito? ");
                    	double valor = objInput.nextDouble();
                    	System.out.println("");
                    	this.depositar(valor);
                		System.out.println("Seu saldo atual: " + this.getSaldo());
                    } else if (opcao == 2) {
                    	System.out.println("Qual o valor de saque? ");
                    	double valor = objInput.nextDouble();
                    	System.out.println("");
                    	this.sacar(valor);
            			System.out.println("Seu saldo atual: " + this.getSaldo());
                    } else {
                    	System.out.println("Valor Incorreto.");
                    }
                    break;
            	case 2:
            		this.visualizarExtrato();
            		break;
            	case 3:
            		System.out.println("Para qual conta você deseja enviar? Digite o email da conta");
            		String email = objInput.next();
            		System.out.println("Digite o valor que você deseja transferir: ");
            		double valor = objInput.nextDouble();
            		this.transferenciaBancaria(valor, email);
            		break;
            	case 4:
            		System.out.println("Onde você deseja realizar o seu investimento? ");
            		System.out.println("1 - CDB (Rentabilidade de 3,11% - RISCO III)");
                    System.out.println("2 - LCI (Rentabilidade de 2,50% - RISCO II)");
                    System.out.println("3 - Tesouro Selic (Rentabilidade de 1,10% - RISCO I)");
                    opcao = objInput.nextInt();
                    if (opcao == 1) {
                        System.out.println("Qual o valor: ");
                		double valorInvestimento = objInput.nextDouble();
                    	this.realizarInvestimento("CDB", valorInvestimento, 0.0311, "Risco III");
                    } else if (opcao == 2) {
                    	System.out.println("Qual o valor: ");
                		double valorInvestimento = objInput.nextDouble();
                    	this.realizarInvestimento("LCI", valorInvestimento, 0.025, "Risco II");
                    } else if (opcao == 3) {
                    	System.out.println("Qual o valor: ");
                		double valorInvestimento = objInput.nextDouble();
                    	this.realizarInvestimento("Tesouro Selic", valorInvestimento, 0.0110, "Risco I");
                    } else {
                    	System.out.println("OPÇÃO INCORRETA! Escolha alguma das opções");
                    }
            		break;
            	case 5:
            		this.visualizarInvestimentos();
            		break;
            	case 6:
            		System.out.println("SISTEMA NÃO IMPLEMENTADO!");
            		break;
           }
		}
	}
	
	
	public void transferenciaBancaria(double valor, String emailDestino) {
	    Conta contaDestino = this.buscarConta(emailDestino);
	    if (contaDestino == null) {
	        System.out.println("Conta de destino não encontrada");
	        return;
	    }
	    if (contaDestino.getClass() != this.getClass()) {
	        System.out.println("Apenas é possível realizar transferências entre contas do mesmo tipo");
	        return;
	    }
	 	
	 	if (this.getSaldo() < valor) {
	        System.out.println("Saldo insuficiente");
	        return;
	    }

	 	this.sacar(valor);
	    contaDestino.depositar(valor);
	    System.out.println("Transferência realizada com sucesso");
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

	public boolean isLogado() {
		return isLogado;
	}

	public void setLogado(boolean isLogado) {
		this.isLogado = isLogado;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
}
