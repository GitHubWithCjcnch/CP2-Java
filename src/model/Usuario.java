package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
	int id;
	String nome;
	String email;
	String senha;
	Date loginDate = new Date();
	DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	String dateFormatted = dateFormat.format(loginDate);
	
	
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDateFormatted() {
		return dateFormatted;
	}	
}
