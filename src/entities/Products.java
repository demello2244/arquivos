package entities;

public class Products {
	
	String nome;
	double pre�o;
	int quantidade;
	
	public Products() {
		
	}
	
	public Products(String nome, double pre�o, int quantidade) {
		this.nome = nome;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double total() {
		return pre�o*quantidade;
	}
	
	

}
