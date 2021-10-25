import java.math.BigDecimal;


public class ExecutarTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Orientação a objetos. ");
		produto1.setValorProduto(BigDecimal.valueOf(178));
		
		Produto produto2 = new Produto();
		produto2.setId(0);
		produto2.setNome("Spring Boot. ");
		produto2.setValorProduto(BigDecimal.valueOf(225));
		
		Venda venda = new Venda();
		venda.setDescriçãoVenda("Curso de formação em Java.");
		venda.setEnderecoEntrega("Entrega pelo email.");
		venda.setId(10L);
		venda.setNomeCliente("Josué Fernandes da Silca");
		//venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProduto().add(produto1);
		venda.getListaProduto().add(produto2);
		
		System.out.println("Descrição das vendas: " + venda.getDescricaoVenda() + 
				"\nTotal das vendas R$ " + venda.totalVenda());
		
		
		
		
		
		
		
		
	}
}
