package hello;

public class Cadastro {
	private String email;
	private String endereco;
	private String cep;
	private String bairro;
	private String cidade;
	
	public Cadastro(String email, String endereco, String cep, String bairro, String cidade){
		this.email = email;
		this.endereco = endereco;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public String getCep(){
		return this.cep;
	}
	public void setCep(String cep){
		this.cep = cep;
	}
	public String getBairro(){
		return this.bairro;
	}
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	public String getCidade(){
		return this.cidade;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
}
