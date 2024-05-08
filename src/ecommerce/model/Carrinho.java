package ecommerce.model;

public class Carrinho {
	String produtos;
	float valorTotal;
	String tipoPagamento;
	
	
	public Carrinho(String produtos, float valorTotal, String tipoPagamento) {
		this.produtos = produtos;
		this.valorTotal = valorTotal;
		this.tipoPagamento = tipoPagamento;
	}
	
	public Carrinho() {
	}

	public String getProdutos() {
		return produtos;
	}
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public boolean pagarCarrinho() {
		return true;
	}

	
}
