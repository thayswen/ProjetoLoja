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
	Scanner entrada = new Scanner(System.in);
	Scanner opcao = new Scanner(System.in);

	public void incluirCliente() {
		cadastro = new Cadastro();

		System.out.println("Insira o nome do cadastro: ");
		nome = obterProximoValor();
		cadastro.setNome(nome);

		System.out.println("Insira o seu email do cadastro: ");
		email = obterProximoValor();
		cadastro.setEmail(email);

		System.out.println("Insira o seu CPF: ");
		cpf = obterProximoValorInteiro();
		cadastro.setCPF(cpf);

		System.out.println("Insira o seu telefone: ");
		telefone = obterProximoValorInteiro();
		cadastro.setTelefone(telefone);

		System.out.println("---------");

		dao.incluirCadastro(cadastro);

	}

	private String obterProximoValor() {
		return input.nextLine();
	}

	private Integer obterProximoValorInteiro() {
		return Integer.valueOf(input.nextLine());
	}

	public void atualizarCliente() {
		List<Cliente> listaCliente = dao.mostrarCadastro();
		String escolha = menuEscolha();
		boolean encontrou = false;
		if (escolha.equals("1")) {
			System.out.println("Insira o nome que deseja alterar: ");
			String nomePesquisa = opcao.nextLine();
			for (Cliente cliente : listaCliente) {
				if (nomePesquisa.equals(cliente.getCadastro().getNome())) {
					encontrou = true;
					System.out.println("Insira o novo nome do cadastro: ");
					nome = entrada.nextLine();
					int indice = listaCliente.indexOf(cliente);
					dao.atualizarCadastro(indice, nome);
				}
			}
			if (encontrou == false) {
				System.out.println("Não existe cliente cadastrado para atualizar!!");
			}

		}
	}

	private String menuEscolha() {
		System.out.println("O que gostaria de alterar?\n");
		System.out.println("1 - Nome");
		System.out.println("2 - Email");
		System.out.println("3 - CPF");
		System.out.println("4 - Telefone");
		System.out.println("5 - Tudo");

		return entrada.nextLine();
	}

	public void deletarCliente() {

	}

	public List<Cliente> mostrarCliente() {
		List<Cliente> listaCliente = dao.mostrarCadastro();
		for (Cliente cliente : listaCliente) {
			System.out.println("=====================/=====================");
			System.out.println(cliente.getCadastro().getNome());
			System.out.println(cliente.getCadastro().getEmail());
			System.out.println(cliente.getCadastro().getCPF());
			System.out.println(cliente.getCadastro().getTelefone());
			System.out.println("=====================/=====================");
		}

		return listaCliente;
	}
}
