import java.math.BigDecimal;

public class Produto {

	private long id;
	private String nome;
	private String categoria;
	private BigDecimal ValorProduto;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValorProduto() {
		return ValorProduto;
	}
	public void setValorProduto(BigDecimal ValorProduto) {
		this.ValorProduto = ValorProduto;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", ValorProduto=" + ValorProduto
				+ ", getId()=" + getId() + ", getNome()=" + getNome() + ", getValorProduto()=" + getValorProduto()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
