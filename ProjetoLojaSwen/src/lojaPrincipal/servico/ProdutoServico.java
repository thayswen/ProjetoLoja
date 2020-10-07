package lojaPrincipal.servico;

import java.util.List;
import java.util.Scanner;

import lojaDAO.ProdutoDAO;
import lojaPrincipal.entidade.Cadastro;
import lojaPrincipal.entidade.Produto;

public class ProdutoServico {

	private Cadastro cadastro;
	private String nomeProduto;
	private double valor;
	private List<Produto> listaProduto;

	ProdutoDAO dao = new ProdutoDAO();
	Scanner input = new Scanner(System.in);

	public void incluirProduto() {
		cadastro = new Cadastro();

		System.out.println("Insira o nome do produto: ");
		nomeProduto = input.next();
		cadastro.setNomeProduto(nomeProduto);

		System.out.println("Qual o valor desse produto? ");
		valor = input.nextInt();
		cadastro.setValor(valor);
	}

	public void atualizarProduto() {

	}

	public void deletarProduto() {

	}

	public List<Produto> mostrarProduto() {
		List<Produto> listaProduto = dao.mostrarCadastro();
		return listaProduto;

	}
}
