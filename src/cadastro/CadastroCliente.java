package cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cadastro.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.println("====================== CADASTRO DE CLIENTES ======================");

		char resposta;
		// Cliente[] cadastroClientes = new Cliente[10];
		List<Cliente> listaClientes = new ArrayList<Cliente>();

		do {
			System.out.println("");
			System.out.println("Clientes# ");
			System.out.print("Código cliente: ");
			cliente.codigoCliente = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			cliente.nome = sc.nextLine();
			System.out.print("Idade: ");
			cliente.idade = sc.nextInt();
			System.out.print("Celular:(61) ");
			sc.nextLine();
			cliente.celular = sc.nextInt();
			System.out.print("Endereço: ");
			sc.nextLine();
			cliente.endereco = sc.nextLine();
			System.out.print("Complemento: ");
			cliente.complemento = sc.nextLine();
			System.out.print("Bairro: ");
			cliente.bairro = sc.nextLine();
			System.out.print("Cidade: ");
			cliente.cidade = sc.nextLine();
			System.out.print("CEP: ");
			cliente.cep = sc.nextInt();

			System.out.println("Deseja realizar outro cadastro (S/N) ? ");
			resposta = sc.next().charAt(0);

			System.out.println("====================== Cadastro realizado ======================" + "\n ");

			// System.out.println(cliente.toString());

			listaClientes.add(cliente);

		} while (resposta != 'N');

		sc.close();

		System.out.println("Clientes armazenados");

		for (Cliente clienteAux : listaClientes) {

			System.out.println(clienteAux);
			System.out.println(" \n =========== \n ");
			
		
		}

	}

}