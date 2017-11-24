package hello;

import java.util.LinkedList;
import java.util.List;


public class Venda {
	private String registroVenda;
	private double valorVenda;
	private List<Produto> produtosVendas = new LinkedList<Produto>();
	
	public Venda(String registroVenda, double valorVenda){
		this.registroVenda = registroVenda;
		this.valorVenda = valorVenda;
	}
	public List<Produto> getProdutos(){
		return this.produtosVendas;
	}
	public String getRegistroVenda(){
		return this.registroVenda;
	}
	public void setRegistroVenda(String registroVenda){
		this.registroVenda = registroVenda;
	}
	public double getValorVenda(){
		return this.valorVenda;
	}
	public void setValorVenda(double valorVenda){
		this.valorVenda = valorVenda;
	}
	public boolean comparar(Venda vnd){
		if(registroVenda == vnd.registroVenda ){
			return true;
		} else {
			return false;
		}
	}
	
}
