package view;

import java.util.Scanner;

import model.Usuario;
import model.Administrador;
import model.Sistema;

public class main {
	public static void main(String[] args) {
		Scanner objInput = new Scanner(System.in);
		
		// cada nova conta precisa de uma nova instância
		Usuario usuario1 = new Usuario("usuario1", "senha123", "Paulo", "Paulo@gmail.com", objInput);
		Usuario usuario2 = new Usuario("usuario2", "senha456", "Rogerio", "Rogerio@gmail.com", objInput);
		Usuario usuario3 = new Usuario("usuario3", "senha789", "Sandra", "Sandra@gmail.com", objInput);
		Administrador admin = new Administrador("admin", "admin", objInput);
		
		// Aqui estamos adicionando cada conta instânciada em um array 
		// para que possa ser mostrado ao Administrador quando ele for checar a quantidade de contas criadas
		Sistema.addConta(usuario1);
	    Sistema.addConta(usuario2);
	    Sistema.addConta(usuario3);
	    Sistema.addConta(admin);
	    
	    
		while(true) {
			System.out.println("                    BEM VINDO                    ");
			System.out.println("_________________________________________________");
			System.out.println("                    LOGIN                    ");
			System.out.println("_________________________________________________");
			System.out.println("Usuário: ");
			String emailUser = objInput.next();
			System.out.println("Senha: ");
			String senhaUser = objInput.next();
			if (usuario1.login(emailUser, senhaUser)) {
				usuario1.exibirMenu();
			} else if (usuario2.login(emailUser, senhaUser)) {
				usuario2.exibirMenu();
			} else if (usuario3.login(emailUser, senhaUser)) {
				usuario3.exibirMenu();
			} else if (admin.login(emailUser, senhaUser)) {
				admin.exibirMenu();
			} else {
				System.out.println("Usuário ou senha inválidos.");
				continue;
			}
		}
	}
}
