package informationexpert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
	private Date dataVenda;
	private List<ItemVenda> itens;
	
	
	public Venda() {
		this.itens = new ArrayList<>();
	}
	
	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public double total() {
		double total = 0.0;
		for(ItemVenda item : itens) {
			double subtotal = item.getQuantidade() * item.getProduto().getPreco();
			total += subtotal;
		}
		
		return total;
	}
	

	
	
	
	
	
	
	
	
//	public double total2() {
//		double total = 0.0;
//		for(ItemVenda item : itens) {
//			total += item.subtotal();
//		}
//		
//		return total;
//	}
}
