package hello;

import java.util.LinkedList;
import java.util.List;

import com.sun.org.apache.xml.internal.security.signature.ObjectContainer;

public class Sistema {
	
	private List<Produto> produtos = new LinkedList<Produto>();
	private List<Vendedor> vendedores = new LinkedList<Vendedor>();
	private List<Cliente> clientes = new LinkedList<Cliente>();
	private List<Venda> vendas = new LinkedList<Venda>();
	private Administrador adm;
	private MeuDAO  banco = new MeuDAO();

	
	public void addProduto(Produto prod){
		banco.adicionarProduto(prod);
	}
	public void delProduto(int registroProduto){
		produtos.remove(registroProduto);
	}
	public void addVendedor(Vendedor vend){
		vendedores.add(vend);
	}
	public void delVendedor(int cpf){
		vendedores.remove(cpf);
	}
	public void addCliente(Cliente obj){
		banco.adicionarCliente(obj);;
	}
	public void delCliente(int cpf){
		clientes.remove(cpf);
	}
	
	public void addVenda(Venda vnd){
		vendas.add(vnd);
	}
	
	public Produto buscarProduto(Especificacao spec){
		for(Produto produto:produtos){
			if(produto.getSpec().comparar(spec)) return produto;
		}
		return null;
	}
	
	public Cliente buscarCliente(String cpf){
		return banco.buscarClienteNoBanco(cpf);
	}
	
	public Produto buscarRegistroProduto(String registroProduto){
		return banco.buscarProdutoNoBanco(registroProduto);
//		for(Produto produto:produtos){
//			if(produto.getRegistroProduto().equals(registroProduto)) return produto;
//		}
//		return null;
	}
	public void registrarVenda(Venda reg){
		vendas.add(reg);
	}
	
	
	public Venda buscarVendas(String registroVenda){
		for(Venda venda:vendas){
			if(venda.getRegistroVenda().equals(registroVenda)) return venda;
		}
		return null;
	}
	
	
	public Venda buscarVenda(String registroVenda){
		for(Venda venda:vendas){
			if(venda.getRegistroVenda().equals(registroVenda)) return venda;
		}
		return null;
	}
	public void addCadastroCliente(Cliente cliente){
		clientes.add(cliente);
	}
	
	
	public void delCadastroCliente(int cpf){
		clientes.remove(cpf);
	}
	
	
	public Administrador loginAdm(int cpf,String senha){
		if(adm.equals(cpf) && adm.equals(senha)) return adm;
		return null;
	}
	
	
	public Vendedor loginVendedor(int cpf,String senha){
		for(Vendedor vendedor:vendedores){
			if(vendedor.equals(cpf) && vendedor.equals(senha)) return vendedor;
		}
		return null;
	}

	public List<Produto> buscarEspecificacao(Especificacao spec){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		
		for(Produto produto:produtos){
			 if(spec.comparar(produto.getSpec())) produtosEncontrados.add(produto);
		}
		
		return produtosEncontrados;
	}
	public List<Produto> getProdutos(){
		return this.produtos;
	}
	public List<Vendedor> getVendedor(){
		return this.vendedores;
	}
	public List<Cliente> getCliente(){
		return this.clientes;
	}
	public List<Venda> getVenda(){
		return this.vendas;
	}
	public void addAdm(Administrador adm){
		this.adm = adm;
	}
	public Administrador getAdm(){
		return adm;
	}
	public boolean loginADM(Administrador adm){
		if(adm.matches(this.adm)) return true;
		return false;
	}
	public boolean loginVend(Vendedor vend){
		if(vend.matchess(vend)) return true;
		return false;
	}
}
