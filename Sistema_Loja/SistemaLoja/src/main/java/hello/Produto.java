package hello;

public class Produto {
	private String registroProduto;
	private Especificacao spec;
	
	public Produto(String registroProduto, Especificacao spec){
		this.registroProduto = registroProduto;
		this.spec = spec;
	}
	
	public String getRegistroProduto(){
		return this.registroProduto;
	}
	public void setRegistroProduto(String registroProduto){
		this.registroProduto = registroProduto;
	}
	public Especificacao getSpec(){
		return this.spec;
	}
	public void setSpec(Especificacao spec){
		this.spec = spec;
	}
}
