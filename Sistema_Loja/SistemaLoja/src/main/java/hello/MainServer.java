package hello;

import static spark.Spark.*;


public class MainServer {
	
	final static Sistema sistema = new Sistema();
	

	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 7777;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarProduto();
		incializarCliente();
		inicializarVenda();
		
		
		
		Controller controller = new Controller(sistema);
		
		controller.bucarProduto();
	    
	    controller.buscarCliente();
	    
	    controller.buscarRegistro();
		
		controller.buscarVenda();
		
		controller.setCliente();
		
		controller.adicionarProduto();
		
		
		
    }
    
    public static void inicializarProduto(){
    	sistema.addProduto(new Produto ("125", new Especificacao("corrente", "100", "10", "20", "cartier")));
    }
    
    public static void incializarCliente(){
    	sistema.addCliente(new Cliente("Ana","5204803016",new Cadastro("ymail@ana","Rua sem fim","12360000","CastleRock","KingIsland")));
    }
	
	public static void inicializarVenda(){
		sistema.addVenda(new Venda("596202",321));
	}
    

    
    
   
    
    
    
}
