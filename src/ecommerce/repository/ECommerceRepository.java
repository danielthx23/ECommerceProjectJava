package ecommerce.repository;

import ecommerce.model.*;

public interface ECommerceRepository {
	public void procurarPorId(String id);
	public void procurarPorCpf(String cpf);
	public void listarTodasProdutos();
	public void listarTodosCliente();
	public void cadastrarCliente(Cliente cliente);
	public void cadastrarProduto(Produto produto);
	public void atualizar(Produto produto);
	public void deletarProduto(String id);
	public void deletarCliente(String cpf);
}
