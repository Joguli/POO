import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String descri��oVenda;	
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	
	private List<Produto> listaProduto = new ArrayList<Produto>();
	
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescri��oVenda() {
		return descri��oVenda;
	}
	public void setDescri��oVenda(String descri��oVenda) {
		this.descri��oVenda = descri��oVenda;
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
	
}
