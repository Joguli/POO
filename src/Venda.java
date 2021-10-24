import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String descriçãoVenda;	
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
	public String getDescriçãoVenda() {
		return descriçãoVenda;
	}
	public void setDescriçãoVenda(String descriçãoVenda) {
		this.descriçãoVenda = descriçãoVenda;
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
