package Invoice;

import java.math.BigDecimal;

public class LineItem {
	private String lineItemDescription;
	private BigDecimal lineItemAmount;

	public LineItem() {
		lineItemDescription = new String();
		lineItemAmount = new BigDecimal(0);
	}


	public String getLineItemDescription() {
		return lineItemDescription;
	}

	public BigDecimal getLineItemAmount() {
		return lineItemAmount;
	}
	
	public void setLineItemDescription(String description) {
		lineItemDescription = description;
	}
	
	public void setLineItemAmount(BigDecimal amount) {
		lineItemAmount = amount;
	}

}
