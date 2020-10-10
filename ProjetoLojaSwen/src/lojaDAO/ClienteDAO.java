package lojaDAO;

import java.util.ArrayList;
import java.util.List;

import lojaPrincipal.entidade.Cadastro;
import lojaPrincipal.entidade.Cliente;

public class ClienteDAO {

	private List<Cliente> listaCliente;

	public ClienteDAO() {
		this.listaCliente = new ArrayList<>();
	}

	public void incluirCadastro(Cadastro cadastro) {
		Cliente cadastroCliente = new Cliente();
		cadastroCliente.setCadastro(cadastro);
		listaCliente.add(cadastroCliente);

	}

	public void atualizarCadastro(int indice, String cadastroAtual) {
		listaCliente.get(indice).getCadastro().setNome(cadastroAtual);
	}

	public void atualizarCadastroEmail(int indice, String cadastroAtual) {
		listaCliente.get(indice).getCadastro().setEmail(cadastroAtual);
	}

	public void atualizarCadastroCPF(int indice, int cadastroAtual) {
		listaCliente.get(indice).getCadastro().setCPF(cadastroAtual);
	}

	public void atualizarCadastroTelefone(int indice, int cadastroAtual) {
		listaCliente.get(indice).getCadastro().setTelefone(cadastroAtual);
	}

	public List<Cliente> mostrarCadastro() {
		return listaCliente;

	}

}
