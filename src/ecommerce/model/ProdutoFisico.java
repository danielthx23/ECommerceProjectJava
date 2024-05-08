package ecommerce.model;

public class ProdutoFisico extends Produto {

	private String lote;
	private int anoFabricacao;
	
	public ProdutoFisico(float valorProduto, String idProduto, String nomeProduto, String tipoProduto, int quantidade,
			String lote, int anoFabricacao) {
		super(valorProduto, idProduto, nomeProduto, tipoProduto, quantidade);
		this.lote = lote;
		this.anoFabricacao = anoFabricacao;
	}
	
	@Override
	public void visualizarDetalhesProduto() {
		super.visualizarDetalhesProduto();
		System.out.println("Lote do produto: " + this.lote);
		System.out.println("Ano de fabricação do produto: " + this.anoFabricacao);
	}

}
