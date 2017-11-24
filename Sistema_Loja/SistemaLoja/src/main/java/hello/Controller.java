package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Sistema sistema;
	
	
	public Controller(Sistema sistema){
		this.sistema = sistema;
	}
	
	public void bucarProduto(){
		get("/especificacao/:nomeProduto/:tamanho/:quantidade/:comprimento/:modelo", (req, res) ->{
			
			
			Especificacao spec = new Especificacao(req.params(":nomeProduto"), req.params(":tamanho"),  req.params(":quantidade"), req.params(":comprimento"), req.params(":modelo"));
			List<Produto> produtoEncontrados = sistema.buscarEspecificacao(spec);	
			return new Gson().toJson(produtoEncontrados);
			
		});
		
	}
	
	public void buscarCliente(){
		get("/cliente/:cpf",(req,res) ->{
			
			Cliente cliente = sistema.buscarCliente(req.params(":cpf"));
			return new Gson().toJson(cliente);
		});
	}
	
	public void buscarRegistro(){
		get("/produto/:registroProduto",(req,res) ->{
			Produto produto = sistema.buscarRegistroProduto(req.params(":registroProduto"));
			return new Gson().toJson(produto);
		});
	}
	
	public void buscarVenda(){
		get("/venda/:registroVenda",(req,res) ->{
			Venda venda = sistema.buscarVenda(req.params(":registroVenda"));
			return new Gson().toJson(venda);
		});
	}
	
	public void setCliente(){
		get("/cliente/:nomeCliente/:cpf/:email/:endereco/:cep/:bairro/:cidade",(req,res) ->{
			sistema.addCliente(new Cliente(req.params(":nomeCliente"),req.params(":cpf"), new Cadastro(req.params(":email"),req.params(":endereco"),req.params(":cep"),req.params(":bairro"),req.params(":cidade"))));
		return null;	
		});
	}
	
	
	public void adicionarProduto(){
		get("/produto/:registroProduto/:nomeProduto/:tamanho/:quantidade/:comprimento/:modelo",(req,res) ->{
			sistema.addProduto(new Produto(req.params(":registroProduto"),new Especificacao(req.params(":nomeProduto"), req.params(":tamanho"),  req.params(":quantidade"), req.params(":comprimento"), req.params(":modelo"))));
		return null;	
		});
	}

}


