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
	private int cpf;
	private int telefone;
	private String email;
	Scanner input = new Scanner(System.in);

	public void incluirCliente() {
		cadastro = new Cadastro();
		
		System.out.println("Insira o nome do cadastro: ");
		nome = input.nextLine();
		cadastro.setNome(nome);
		
		System.out.println("Insira o seu CPF: ");
		cpf = input.nextInt();
		cadastro.setCPF(cpf);
		
		System.out.println("Insira o seu telefone: ");
		telefone = input.nextInt();
		cadastro.setTelefone(telefone);
		
		System.out.println("Insira o seu email do cadastro: ");
		email = input.nextLine();
		cadastro.setEmail(email);
		
		
		dao.incluirCadastro(cadastro);

	}
	
	public List<Cliente> mostrarCliente(){
		List<Cliente> listaCliente = dao.mostrarCadastro();
		return listaCliente;
	}
}
