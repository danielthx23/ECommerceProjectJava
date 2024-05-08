package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.controller.ECommerceController;
import ecommerce.model.Cliente;
import ecommerce.model.Produto;
import ecommerce.model.ProdutoDigital;
import ecommerce.model.ProdutoFisico;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ECommerceController loja = new ECommerceController();
		
		float valorProduto;
		int opcao = 0, anoDeNascimento, tipo = 0, quantidade, anoFabricacao;
		String nomeCliente, cpfCliente, tipoPagamento, tipoProduto, idProduto, nomeProduto, especificacoes, serialChip,
				lote;

		do {
			System.out.println(Cores.TEXT_CYAN_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_PURPLE_BOLD + "                     E-COMMERCE                      ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_CYAN_BOLD + "*****************************************************");
			System.out.println(Cores.TEXT_PURPLE_BOLD + "                                                     ");
			System.out.println("            1 - Cadastrar novo cliente               ");
			System.out.println("            2 - Cadastrar novo produto               ");
			System.out.println("            3 - Procurar cliente por CPF             ");
			System.out.println("            4 - Procurar produto por ID              ");
			System.out.println("            5 - Adicionar ao carrinho de produtos    ");
			System.out.println("            6 - Visualizar o carrinho de produtos    ");
			System.out.println("            7 - Realizar o pagamento de produtos     ");
			System.out.println("            8 - Visualizar detalhes do produto       ");
			System.out.println("            9 - Visualizar dados dos clientes        ");
			System.out.println("            10 - Deletar cliente                     ");
			System.out.println("            11 - Deletar produto                     ");
			System.out.println("            12 - Atualizar informações do cliente    ");
			System.out.println("            13 - Atualizar informações do produto    ");
			System.out.println("            14 - Sair                                ");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_CYAN_BOLD + "*****************************************************");
			System.out.print(Cores.TEXT_PURPLE_BOLD + "Entre com a opção desejada: ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.err.println(Cores.TEXT_RESET + "\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			System.out.println(Cores.TEXT_RESET);

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_RESET + "Cadastrar cliente\n");

				leia.nextLine();
				System.out.println("Digite o nome do cliente: ");
				nomeCliente = leia.nextLine();
				System.out.println("Digite o CPF do cliente: ");
				cpfCliente = leia.next();
				System.out.println("Digite o tipo de pagamento do cliente: ");
				tipoPagamento = leia.next();
				System.out.println("Digite o ano de nascimento do cliente: ");
				anoDeNascimento = leia.nextInt();

				loja.cadastrarCliente(new Cliente(nomeCliente, cpfCliente, tipoPagamento, anoDeNascimento));

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_RESET + "Cadastrar produto\n");
				leia.nextLine();
				System.out.println("Digite o nome do produto: ");
				nomeProduto = leia.nextLine();
				System.out.println("Digite o valor do produto: ");
				valorProduto = leia.nextFloat();
				System.out.println("Digite o ID do produto: ");
				idProduto = leia.next();
				System.out.println("Digite a quantidade do produto: ");
				quantidade = leia.nextInt();

				do {
					System.out.println("Digite o Tipo da Conta (1-Digital ou 2-Fisico): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);
				switch (tipo) {

				case 1 -> {
					leia.nextLine();
					System.out.println("Digite as especificações do produto: ");
					especificacoes = leia.nextLine();
					System.out.println("Digite o chip Serial do produto: ");
					serialChip = leia.next();
					loja.cadastrarProduto(new ProdutoDigital(valorProduto, idProduto, nomeProduto, "Digital",
							quantidade, especificacoes, serialChip));
				}

				case 2 -> {
					System.out.println("Digite o lote do produto: ");
					especificacoes = leia.next();
					System.out.println("Digite o ano da fabricação do produto: ");
					anoFabricacao = leia.nextInt();
					loja.cadastrarProduto(new ProdutoFisico(valorProduto, idProduto, nomeProduto, "Fisico", quantidade,
							especificacoes, anoFabricacao));
				}
				}

				keyPress();
				break;
			case 3:
				System.out.println("Digite o CPF do cliente: ");
				cpfCliente = leia.next();
				loja.buscarNaCollectionClientes(cpfCliente).visualizarDetalhesCliente();
				keyPress();
				break;
			case 4:
				System.out.println("Digite o ID do produto: ");
				idProduto = leia.next();
				loja.buscarNaCollectionProdutos(idProduto).visualizarDetalhesProduto();
				keyPress();
				break;
			case 5:
				System.out.println("Adicionar produto no carrinho");
				System.out.println("Digite o ID do produto: ");
				idProduto = leia.next();
				loja.adicionarCarrinho(idProduto);
				keyPress();
				break;
			case 6:
				System.out.println("Visualizar o carrinho");
				loja.visualizarCarrinho();
				keyPress();
				break;
			case 7:
				loja.pagarCarrinho();
				keyPress();
				break;
			case 8:
				System.out.println("\nListar todas os produtos");
				loja.listarTodasProdutos();
				keyPress();
				break;
			case 9:
				System.out.println("\nListar todas os clientes");
				loja.listarTodosCliente();
				keyPress();
				break;
			case 10:
				System.out.println("Deletar cliente");

				System.out.println("Digite o cpf do conta: ");
				cpfCliente = leia.next();

				loja.deletarCliente(cpfCliente);
				keyPress();
				break;
			case 11:
				System.out.println("Deletar produto");

				System.out.println("Digite o id do produto: ");
				idProduto = leia.next();

				loja.deletarProduto(idProduto);
				keyPress();
				break;
			case 12:
				System.out.println(Cores.TEXT_RESET + "Atualizar dados do cliente\n");

				System.out.println("Digite o cpf do cliente: ");
				cpfCliente = leia.next();

				var buscaCliente = loja.buscarNaCollectionClientes(cpfCliente);

				if (buscaCliente != null) {

					leia.nextLine();
					System.out.println("Digite o nome do cliente: ");
					nomeCliente = leia.nextLine();
					System.out.println("Digite o CPF do cliente: ");
					cpfCliente = leia.next();
					System.out.println("Digite o tipo de pagamento do cliente: ");
					tipoPagamento = leia.next();
					System.out.println("Digite o ano de nascimento do cliente: ");
					anoDeNascimento = leia.nextInt();

					loja.cadastrarCliente(new Cliente(nomeCliente, cpfCliente, tipoPagamento, anoDeNascimento));
				} else
					System.out.println("\nO CPF desse cliente não foi encontrado!");
				keyPress();
				break;
			case 13:
				System.out.println(Cores.TEXT_RESET + "Atualizar dados do produto\n");

				System.out.println("Digite o ID do produto: ");
				idProduto = leia.next();

				var buscaProduto = loja.buscarNaCollectionClientes(idProduto);

				if (buscaProduto != null) {

					leia.nextLine();
					System.out.println("Digite o nome do produto: ");
					nomeProduto = leia.nextLine();
					System.out.println("Digite o valor do produto: ");
					valorProduto = leia.nextFloat();
					System.out.println("Digite o ID do produto: ");
					idProduto = leia.next();
					System.out.println("Digite a quantidade do produto: ");
					quantidade = leia.nextInt();

					do {
						System.out.println("Digite o Tipo da Conta (1-Digital ou 2-Fisico): ");
						tipo = leia.nextInt();
					} while (tipo < 1 && tipo > 2);
					switch (tipo) {

					case 1 -> {
						leia.nextLine();
						System.out.println("Digite as especificações do produto: ");
						especificacoes = leia.nextLine();
						System.out.println("Digite o chip Serial do produto: ");
						serialChip = leia.next();
						loja.cadastrarProduto(new ProdutoDigital(valorProduto, idProduto, nomeProduto, "Digital",
								quantidade, especificacoes, serialChip));
					}

					case 2 -> {
						System.out.println("Digite o lote do produto: ");
						especificacoes = leia.next();
						System.out.println("Digite o ano da fabricação do produto: ");
						anoFabricacao = leia.nextInt();
						loja.cadastrarProduto(new ProdutoFisico(valorProduto, idProduto, nomeProduto, "Fisico", quantidade,
								especificacoes, anoFabricacao));
					}
					}

				} else
					System.out.println("\nO ID desse produto não foi encontrado!");
				keyPress();
				break;
			case 14:
				sobre();
				leia.close();
				System.exit(0);
				break;
			default:
				System.err.println("\nOpção Inválida!\n" + Cores.TEXT_RESET);

				keyPress();
				break;
			}
		} while (opcao != 11);
	}

	public static void sobre() {
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD
				+ "\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:                                ");
		System.out.println("Daniel Saburo Akiyama - danielakiyama8@gmail.com         ");
		System.out.println("https://github.com/danielthx23                           ");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.err.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
