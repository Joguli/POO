import java.math.BigDecimal;

public class Produto {

	private long id;
	private String nome;
	private BigDecimal valorProduto;
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
		return valorProduto;
	}
	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}
	
}
