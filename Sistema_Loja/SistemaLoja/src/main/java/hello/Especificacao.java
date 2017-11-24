package hello;

public class Especificacao {
	private String nomeProduto;
	private String tamanho;
	private String quantidade;
	private String comprimento;
	private String modelo;
	
	public Especificacao(String nomeProduto, String tamanho, String quantidade, String comprimento, String modelo){
		this.nomeProduto = nomeProduto;
		this.tamanho = tamanho;
		this.quantidade = quantidade;
		this.comprimento = comprimento;
		this.modelo = modelo;
	}
	
	public String getNomeProduto(){
		return this.nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto){
		this.nomeProduto = nomeProduto;
	}
	public String getTamanho(){
		return this.tamanho;
	}
	
	public void setTamanho(String tamanho){
		this.tamanho = tamanho;
	}
	
	public String getQuantidade(){
		return this.quantidade;
	}
	
	public void setQuantidade(String quantidade){
		this.quantidade = quantidade;
	}
	
	public String getComprimento(){
		return this.comprimento;
	}
	
	public void setComprimento(String comprimento){
		this.comprimento = comprimento;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public boolean comparar(Especificacao spec){
		if(nomeProduto.equals(spec.nomeProduto) && tamanho.equals(spec.tamanho) && quantidade.equals(spec.quantidade) && comprimento.equals(spec.comprimento) && modelo.equals(spec.modelo)){
			return true;
		} else {
			return false;
		}
	}

}
