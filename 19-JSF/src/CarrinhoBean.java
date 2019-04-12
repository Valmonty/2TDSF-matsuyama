import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {

	private List<String> listaSelecionados;
	private String quantidade;
	private String formaPagamento;

	public void comprar() {
		for (String valor : listaSelecionados) {
			System.out.println(valor);
		}

		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Forma de pagamento: " + getFormaPagamento());
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<Produto> getProdutos() {
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto(1, "Notebook"));
		produtos.add(new Produto(2, "Tablet"));
		produtos.add(new Produto(3, "SmartWatch"));
		return produtos;
	}

	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}

	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public CarrinhoBean(List<String> listaSelecionados, String quantidade) {
		super();
		this.listaSelecionados = listaSelecionados;
		this.quantidade = quantidade;
	}

	public CarrinhoBean() {
		super();
	}

}
