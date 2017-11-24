package hello;

public class Vendedor {
	private int cpf;
	private String nome;
	private String senha;
	private Cadastro cad;
	
	public Vendedor(int cpf, String nome, String senha, Cadastro cad){
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.cad = cad;
	}
	
	public int getCpf(){
		return this.cpf;
	}
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getSenha(){
		return this.senha;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}
	public Cadastro getCadastro(){
		return this.cad;
	}
	public void setCadastro(Cadastro cad){
		this.cad = cad;
	}
	public boolean matchess(Vendedor vend){
		if(cpf == vend.cpf  && senha.equals(vend.senha)) return true;
		return false;
	}

}
