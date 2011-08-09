package com.stripe.datamodel;

public class InvoiceItem {
	protected long date, amount;
	protected String description, currency, id;

	public InvoiceItem() {
	}

	public InvoiceItem(long date, long amount, String description,
			String currency, String id) {
		super();
		this.date = date;
		this.amount = amount;
		this.description = description;
		this.currency = currency;
		this.id = id;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
