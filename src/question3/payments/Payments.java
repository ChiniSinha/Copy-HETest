/*
 * This is the payment object
 */
package question3.payments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payments {
	
	private Date dateTime;
	private Double amount;
	
	public Payments(String paymentDateTime, String amount) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = formatter.parse(paymentDateTime);
		this.dateTime = date;
		this.amount = Double.parseDouble(amount);
	}
	
	public Date getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
