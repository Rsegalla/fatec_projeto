package hello;

public class Cliente {
	private String nome;
	private String cpf;
	private Cadastro cad;
	
	public Cliente(String cpf){
		this.cpf = cpf;
	}
	
	public Cliente(String nome,String cpf,Cadastro cad){
		this.nome = nome;
		this.cpf = cpf;
		this.cad = cad;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getCpf(){
		return this.cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public Cadastro getCad(){
		return this.cad;
	}
	public void setCad(Cadastro cad){
		this.cad = cad;
	}
	


}
