import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String descricaoVenda;	
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	
	public double totalVenda() {
		double total = 0.0;
		for (Produto produto : listaProduto) {
			total += produto.getValorProduto().doubleValue();
		}
		return total;
	}
	
	private List<Produto> listaProduto = new ArrayList<Produto>();
	
	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	public void setDescri??oVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	@Override
	public String toString() {
		return "Venda [descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente + ", enderecoEntrega="
				+ enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProduto=" + listaProduto + ", id=" + id
				+ ", getId()=" + getId() + ", getDescricaoVenda()=" + getDescricaoVenda() + ", getNomeCliente()="
				+ getNomeCliente() + ", getEnderecoEntrega()=" + getEnderecoEntrega() + ", getValorTotal()="
				+ getValorTotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
