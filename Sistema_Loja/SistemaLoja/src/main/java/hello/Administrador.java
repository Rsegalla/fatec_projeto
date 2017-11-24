package hello;

public class Administrador {
	private String nome;
	private int cpf;
	private String senha;
	
	public Administrador (String nome, int cpf, String senha){
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public int getCpf(){
		return this.cpf;
	}
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	public String getSenha(){
		return this.senha;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}
	public boolean matches(Administrador adm){
		if(cpf == adm.cpf  && senha.equals(adm.senha)) return true;
		return false;
	}
}
