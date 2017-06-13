package invoice;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Invoice {
	private BigDecimal total;
	private ArrayList<LineItem> items; 
	private int invoiceNo;
	
	public Invoice() {
		total = new BigDecimal(0);
		items = new ArrayList<>();
		invoiceNo = 0;
	}
	
	public Invoice(BigDecimal total, int invoiceNo) {
		this.total = total;
		this.items = new ArrayList<LineItem>();
		this.invoiceNo = invoiceNo;		
	}
	
	public void addItem(LineItem item) {
		items.add(item);
		total = total.add(item.getLineItemAmount());
	}
	
	public void removeLineItem(int index) {
		total = total.subtract(items.get(index).getLineItemAmount());
		items.remove(index);
	}
	
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
	public int getInvoiceNo() {
		return invoiceNo;
	}
	
	public BigDecimal getTotal() {
		return total;
	}
}
