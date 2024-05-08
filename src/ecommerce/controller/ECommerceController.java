package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Cliente;
import ecommerce.model.Produto;
import ecommerce.repository.ECommerceRepository;

public class ECommerceController implements ECommerceRepository{
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	@Override
	public void procurarPorId(String id) {
		var produto = buscarNaCollectionProdutos(id);

		if (produto != null)
			produto.visualizarDetalhesProduto();
		else
			System.out.println("\nO produto com id: " + id + " não foi encontrado!");

	}
	
	@Override
	public void procurarPorCpf(String id) {
		var cliente = buscarNaCollectionClientes(id);

		if (cliente != null)
			cliente.visualizarDetalhesCliente();
		else
			System.out.println("\nO cliente com id: " + id + " não foi encontrado!");

	}
	
	@Override
	public void listarTodasProdutos() {
		listaProdutos.forEach(produto -> produto.visualizarDetalhesProduto());
	}
	
	@Override
	public void listarTodosCliente() {
		listaClientes.forEach(cliente -> cliente.visualizarDetalhesCliente());
	}

	@Override
	public void cadastrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
		System.out.println("\nO cliente: " + cliente.getNome() + " foi registrado com sucesso!");
		
	}

	@Override
	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto com ID: " + produto.getIdProduto() + " foi registrado com sucesso!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollectionProdutos(produto.getIdProduto());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nA Conta numero: " + produto.getIdProduto() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nA Conta numero: " + produto.getIdProduto() + " não foi encontrada!");
		
	}

	@Override
	public void deletarProduto(String id) {
		var produto = buscarNaCollectionProdutos(id);
		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto Id: " + id + " foi deletado com sucesso!");
		} else
			System.out.println("\nO produto Id: " + id + " não foi encontrado!");
	}
	
	@Override
	public void deletarCliente(String cpf) {
		var cliente = buscarNaCollectionProdutos(cpf);
		if (cliente != null) {
			if (listaClientes.remove(cliente) == true)
				System.out.println("\nO cliente com CPF: " + cpf + " foi deletado com sucesso!");
		} else
			System.out.println("\nO cliente com CPF: " + cpf + " não foi encontrado(a)!");
	}
	
	public Produto buscarNaCollectionProdutos(String id) {
		for (var produto : listaProdutos) {
			if (produto.getIdProduto() == id) {
				return produto;
			}
		}
		return null;
	}
	
	public Cliente buscarNaCollectionClientes(String cpf) {
		for (var cliente : listaClientes) {
			if (cliente.getCpf() == cpf) {
				return cliente;
			}
		}
		return null;
	}

	
}
