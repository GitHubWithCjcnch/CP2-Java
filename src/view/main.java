package view;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner objInput = new Scanner(System.in);
		System.out.println("                    BEM VINDO                    ");
		System.out.println("_________________________________________________");
		System.out.println("Realize o login no sistema:");
		System.out.println("Email: ");
		String emailUser = objInput.next();
		System.out.println("Senha: ");
		String senhaUser = objInput.next();
		
		
		
		int optionUser = objInput.nextInt();
		switch(optionUser) {
			case 1:
				// blabla
				break;
			case 2:
				// blabla
				break;
			case 3:
				// blabla
				break;
		}
	}
}
