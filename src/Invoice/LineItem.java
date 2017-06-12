package Invoice;

import java.util.ArrayList;

public class LineItem {
	private ArrayList<String> lineItemDescription;
	private ArrayList<Float> lineItemAmount;
	
	public LineItem() {
		lineItemDescription = new ArrayList<String>();
		lineItemAmount = new ArrayList<Float>();
	}
	
	/**
	 * 
	 * @param description Description of the line item being added.
	 * @param amount Billing amount of the line item being added. 
	 */
	public void addLineItem(String description, float amount) {
		lineItemDescription.add(description);
		lineItemAmount.add(new Float(amount));
	}
	
	/**  
	 * 
	 * @param index Index of the line item that is to be removed. 
	 */
	public void removeLineItem(int index) {
		lineItemDescription.remove(index);
		lineItemAmount.remove(index);
	}
	
	public String getLineItemDescription(int index) {
		return lineItemDescription.get(index);
	}
	
	public float getLineItemAmount(int index) {
		return lineItemAmount.get(index).floatValue();
	}
	
}
