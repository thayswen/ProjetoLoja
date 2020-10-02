package lojaDAO;

import java.util.ArrayList;
import java.util.List;

import lojaPrincipal.entidade.Cadastro;
import lojaPrincipal.entidade.Cliente;

public class ClienteDAO {
	
	private List<Cliente> listaCliente;
	
	public ClienteDAO () {
		this.listaCliente = new ArrayList<>();
	}
	
	public void incluirCadastro(Cadastro cadastro) {
		Cliente cadastroCliente = new Cliente();
		cadastroCliente.setCadastro(cadastro);
		listaCliente.add(cadastroCliente);
		
	}
	
	public List<Cliente> mostrarCadastro(){
		return listaCliente;
		
	}
	
	
}
