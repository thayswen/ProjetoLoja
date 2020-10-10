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
					System.out.println("O cliente " + nome + " foi atualizado com sucesso! ");
				}
			}
			if (encontrou == false) {
				System.out.println("Não existe cliente cadastrado para atualizar!!");
			}

		}
		if (escolha.equals("2")) {
			System.out.println("Insira o email que deseja alterar: ");
			String emailPesquisa = opcao.nextLine();
			for (Cliente cliente : listaCliente) {
				if (emailPesquisa.equals(cliente.getCadastro().getEmail())) {
					encontrou = true;
					System.out.println("Insira o novo email do cadastro: ");
					email = entrada.nextLine();
					int indice = listaCliente.indexOf(cliente);
					dao.atualizarCadastroEmail(indice, email);
				}
			}
			if (encontrou == false) {
				System.out.println("Não existe cliente cadastrado para atualizar!!");
			}

		}
		
		if (escolha.equals("3")) {
			System.out.println("Insira o CPF que deseja alterar: ");
			Integer cpfPesquisa = opcao.nextInt();
			for (Cliente cliente : listaCliente) {
				if (cpfPesquisa.equals(cliente.getCadastro().getCPF())) {
					encontrou = true;
					System.out.println("Insira o novo CPF do cadastro: ");
					cpf = entrada.nextInt();
					int indice = listaCliente.indexOf(cliente);
					dao.atualizarCadastroCPF(indice, cpf);
				}
			}
			if (encontrou == false) {
				System.out.println("Não existe cliente cadastrado para atualizar!!");
			}

		}
		
		if (escolha.equals("4")) {
			System.out.println("Insira o Telefone que deseja alterar: ");
			Integer telefonePesquisa = opcao.nextInt();
			for (Cliente cliente : listaCliente) {
				if (telefonePesquisa.equals(cliente.getCadastro().getTelefone())) {
					encontrou = true;
					System.out.println("Insira o novo Telefone do cadastro: ");
					telefone = entrada.nextInt();
					
					
					int indice = listaCliente.indexOf(cliente);
					dao.atualizarCadastroTelefone(indice, telefone);
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
	
	private String obterProximoValor() {
		return input.nextLine();
	}

	private Integer obterProximoValorInteiro() {
		return Integer.valueOf(input.nextLine());
	}
}
