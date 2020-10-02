package lojaPrincipal;

import java.util.Scanner;

import lojaPrincipal.servico.ClienteServico;

public class Loja {

	public static void main(String[] args) {

		ClienteServico servico = new ClienteServico();
		boolean continuar = true;
		Scanner input = new Scanner(System.in);

		while (continuar) {
			servico.incluirCliente();

			System.out.println("Deseja continuar o cadastro?");

			String resposta = input.nextLine();
			if (resposta.equalsIgnoreCase("Sim")) {
				continuar = true;
			} else {
				continuar = false;
			}

		}

		input.close();

	}

}
