package ecommerce.model;

public class ProdutoDigital extends Produto{

	private String especificacoes;
	private String chaveDoProduto;
	
	public ProdutoDigital(float valorProduto, String idProduto, String nomeProduto, String tipoProduto,
			int quantidade, String especificacoes, String serialChip) {
		super(valorProduto, idProduto, nomeProduto, tipoProduto, quantidade);
		this.especificacoes = especificacoes;
		this.chaveDoProduto = serialChip;
	}

	@Override
	public void visualizarDetalhesProduto() {
		super.visualizarDetalhesProduto();
		System.out.println("Especificações do produto: " + this.especificacoes);
		System.out.println("Token do produto: " + this.chaveDoProduto);
	}

}
