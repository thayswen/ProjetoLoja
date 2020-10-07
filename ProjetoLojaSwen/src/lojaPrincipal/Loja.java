package lojaPrincipal;

import java.util.Scanner;

import lojaPrincipal.servico.ClienteServico;
import lojaPrincipal.servico.ProdutoServico;

public class Loja {

	Scanner input;
	ClienteServico servicoCliente;
	ProdutoServico servicoProduto;
	boolean executar;

	public static void main(String[] args) {
		new Loja();
	}
			
	
	private Loja() {	
		input = new Scanner(System.in);
		executar = true;
		servicoCliente = new ClienteServico();
		
		System.out.println("Você quer cadastrar:\n");
		System.out.println("1 - Cliente");
		System.out.println("2 - Produto");
		String entrada = input.nextLine();
		
		if(entrada.equals("1")) {
		
		System.out.println("BEM VINDO AO CADASTRO DE CLIENTES\n");

		while (executar) {
			String opcao = menuzinhoFofo();

			if (opcao.equals("1")) {
				servicoCliente.incluirCliente();
			} else if (opcao.equals("2")) {
				servicoCliente.atualizarCliente();
			} else if (opcao.equals("3")) {
				servicoCliente.deletarCliente();
			} else if (opcao.equals("4")) {
				servicoCliente.mostrarCliente();
			} else if (opcao.equalsIgnoreCase("x")) {
				executar = false;
			} else {
				System.out.println("\nOpção Inválida! \n");
			}
		}
	}else {
		MenuProduto();
	}	
}

	private String menuzinhoFofo() {
		System.out.println("Selecione a opção:\n");
		System.out.println("1 - Novo cadastro");
		System.out.println("2 - Atualizar cadastro");
		System.out.println("3 - Deletar cadastros");
		System.out.println("4 - Listar cadastros");
		System.out.println("X - Sair");

		return input.nextLine();
	}
	
	private void MenuProduto() {
		input = new Scanner(System.in);
		executar = true;
		servicoProduto = new ProdutoServico();
		
		System.out.println("BEM VINDO AO CADASTRO DE PRODUTOS\n");

		while (executar) {
			String opcao = menuzinhoFofo();

			if (opcao.equals("1")) {
				servicoProduto.incluirProduto();
			} else if (opcao.equals("2")) {
				servicoProduto.atualizarProduto();
			} else if (opcao.equals("3")) {
				servicoProduto.deletarProduto();
			} else if (opcao.equals("4")) {
				servicoProduto.mostrarProduto();
			} else if (opcao.equalsIgnoreCase("x")) {
				executar = false;
			} else {
				System.out.println("\nOpção Inválida! \n");
			}
		}
	}

}
