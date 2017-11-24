package hello;

import java.util.LinkedList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

public class MeuDAO {
	
	ObjectContainer produtos = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/banco.db4o");
	ObjectContainer products = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/produtos.db4o");

	private List<Cliente> listaClientes = new LinkedList<Cliente>();
	private List<Produto> listaProdutos = new LinkedList<Produto>();

	
	public void adicionarCliente(Cliente novoCliente){
		if(existeCliente(novoCliente.getCpf())){
			produtos.store(novoCliente);
			produtos.commit();
		}
	}

	private boolean existeCliente(String cpf) {
		Query query = produtos.query();
		query.constrain(Cliente.class);
		ObjectSet<Cliente> todosClientes = query.execute();

		for (Cliente cliente : todosClientes) {
			if (cliente.getCpf() == (cpf))
				
				return false;
			
		}
		
		return true;
		
	}
	
	public Cliente buscarClienteNoBanco(String cpf){
		Query query = produtos.query();
		query.constrain(Cliente.class);
		ObjectSet<Cliente> todosClientes = query.execute();
		
		for (Cliente cliente : todosClientes) {
			if(cliente.getCpf().equals(cpf)){
				return cliente;
			}
		}
		
		return null;
	}
	
	public void adicionarProduto(Produto novoProduto){
		if(existeProduto(novoProduto.getRegistroProduto())){
			products.store(novoProduto);
			products.commit();
		}
	}

	private boolean existeProduto(String registroProduto) {
		Query query = products.query();
		query.constrain(Produto.class);
		ObjectSet<Produto> todosProdutos = query.execute();

		for (Produto produto : todosProdutos) {
			if (produto.getRegistroProduto() == registroProduto)
				
				return false;
			
		}
		
		return true;
	}
	
	public Produto buscarProdutoNoBanco(String registro){
		Query query = products.query();
		query.constrain(Produto.class);
		ObjectSet<Produto> todosProdutos = query.execute();
		
		for (Produto produto : todosProdutos) {
			if(produto.getRegistroProduto().equals(registro)){
				return produto;
			}
		}
		
		return null;
	}

}
