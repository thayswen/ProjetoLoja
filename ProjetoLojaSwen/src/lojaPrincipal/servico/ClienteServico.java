package lojaPrincipal.servico;

import java.util.List;
import java.util.Scanner;

import lojaDAO.ClienteDAO;
import lojaPrincipal.entidade.Cadastro;
import lojaPrincipal.entidade.Cliente;

public class ClienteServico {

	private ClienteDAO dao = new ClienteDAO();
	private Cadastro cadastro;
	private String nome;
	Scanner input = new Scanner(System.in);

	public void incluirCliente() {
		cadastro = new Cadastro();
		System.out.println("Insira o nome do cadastro: ");
		nome = input.nextLine();
		cadastro.setNome(nome);
		dao.incluirCadastro(cadastro);

	}
	
	public List<Cliente> mostrarCliente(){
		List<Cliente> listaCliente = dao.mostrarCadastro();
		return listaCliente;
	}
}
