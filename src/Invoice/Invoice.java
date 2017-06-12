package Invoice;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Invoice {
	private BigDecimal total;
	private ArrayList<LineItem> items; 
	
	public Invoice() {
		total = new BigDecimal(0);
		items = new ArrayList<>();
	}
	
	public void addItem(LineItem item) {
		items.add(item);
		total = total.add(item.getLineItemAmount());
	}
	
	public void removeLineItem(int index) {
		items.remove(index);
	}
	
	public BigDecimal getTotal() {
		return total;
	}
}
