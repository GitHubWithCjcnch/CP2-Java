package view;

import java.util.Scanner;

import model.Usuario;
import model.Administrador;
import model.Sistema;

public class main {
	public static void main(String[] args) {		
		Scanner objInput = new Scanner(System.in);
		Usuario usuario1 = new Usuario("usuario1", "senha123", "Paulo", "Paulo@gmail.com");
		Usuario usuario2 = new Usuario("usuario2", "senha456", "Rogerio", "Rogerio@gmail.com");
		Usuario usuario3 = new Usuario("usuario3", "senha789", "Sandra", "Sandra@gmail.com");
		Administrador admin = new Administrador("admin", "admin");
		
		System.out.println("                    BEM VINDO                    ");
		System.out.println("_________________________________________________");
		System.out.println("                    LOGIN                    ");
		System.out.println("_________________________________________________");
		while(true) {
			System.out.println("Usuário: ");
			String emailUser = objInput.next();
			System.out.println("Senha: ");
			String senhaUser = objInput.next();
			if (usuario1.login(emailUser, senhaUser)) {
				usuario1.menuUsuario();
				break;
			} else if (usuario2.login(emailUser, senhaUser)) {
				usuario2.menuUsuario();
				break;
			} else if (usuario3.login(emailUser, senhaUser)) {
				usuario3.menuUsuario();
				break;
			} else if (admin.login(emailUser, senhaUser)) {
				admin.menuAdmin();
				break;
			} else {
				System.out.println("Usuário ou senha inválidos.");
				continue;
			}
		}
		objInput.close();
	}
}
