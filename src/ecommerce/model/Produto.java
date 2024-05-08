package ecommerce.model;

public abstract class Produto {

	private float valorProduto;
	private String idProduto;
	private String nomeProduto;
	private String tipoProduto;
	private int quantidade;
	
	public Produto(float valorProduto, String idProduto, String nomeProduto, String tipoProduto, int quantidade) {
		this.valorProduto = valorProduto;
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.quantidade = quantidade;
	}

	public Produto() {
	}
	
	public float getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public void visualizarDetalhesProduto() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Detalhes do produto:");
		System.out.println("***********************************************************");
		System.out.println("Id do produto: " + this.idProduto);
		System.out.println("Nome do produto: " + this.nomeProduto);
		System.out.println("Valor do produto: " + this.valorProduto);
		System.out.println("Tipo do produto: " + this.tipoProduto);
		System.out.println("Quantidade no estoque: " + this.quantidade);
		
	}
	

}
