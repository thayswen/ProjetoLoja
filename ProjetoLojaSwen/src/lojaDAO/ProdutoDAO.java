package lojaDAO;

import java.util.ArrayList;
import java.util.List;

import lojaPrincipal.entidade.Cadastro;
import lojaPrincipal.entidade.Cliente;
import lojaPrincipal.entidade.Produto;

public class ProdutoDAO {

	private List<Produto> listaProduto;
	public ProdutoDAO() {
		this.listaProduto = new ArrayList<>();
	}

	
	public void cadastrarProduto(Cadastro cadastro){
		Produto cadastroProduto = new Produto();
		cadastroProduto.setCadastro(cadastro);
		listaProduto.add(cadastroProduto);
	}
	
	public List<Produto> mostrarCadastro(){
		return listaProduto;
		
	}
	
}
