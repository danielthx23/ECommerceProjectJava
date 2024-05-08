package ecommerce.model;

public class Cliente {

	private String nome;
	private String cpf;
	private String tipoPagamento;
	private int dataDeNascimento;
	
	public Cliente(String nome, String cpf, String tipoPagamento, int dataDeNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipoPagamento = tipoPagamento;
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public int getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(int dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public void atualizarCliente() {
		
	}
	
	public void visualizarDetalhesCliente() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do cliente:");
		System.out.println("***********************************************************");
		System.out.println("Cpf do cliente: " + this.cpf);
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Tipo de pagamento do cliente: " + this.tipoPagamento);
		System.out.println("Data de nascimento do cliente: " + this.dataDeNascimento);
		
	}
	
	
}
