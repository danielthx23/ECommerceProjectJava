package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao = 0;

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
			System.out.println("            3 - Carrinho de produtos                 ");
			System.out.println("            4 - Visualizar detalhes do produto       ");
			System.out.println("            5 - Realizar pagamento                   ");
			System.out.println("            6 - Visualizar histórico de pedidos      ");
			System.out.println("            7 - Atualizar informações do cliente     ");
			System.out.println("            8 - Sair                                 ");
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
				System.out.println("Cadastrar cliente");
				keyPress();
				break;
			case 2:
				System.out.println("Cadastrar produto");
				keyPress();
				break;
			case 3:
				System.out.println("Carrinho");
				keyPress();
				break;
			case 4:
				System.out.println("Visualizar");
				keyPress();
				break;
			case 5:
				System.out.println("Pagamento");
				keyPress();
				break;
			case 6:
				System.out.println("Histórico");
				keyPress();
				break;
			case 7:
				System.out.println("Atualizar");
				keyPress();
				break;
			case 8:
				sobre();
				leia.close();
				System.exit(0);
				keyPress();
				break;
				
			default:
				System.err.println("\nOpção Inválida!\n" + Cores.TEXT_RESET);

				keyPress();
				break;
			}
		} while (opcao != 8);
	}

	public static void sobre() {
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "\n*********************************************************");
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
