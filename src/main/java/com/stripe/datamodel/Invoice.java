package com.stripe.datamodel;

public class Invoice {
	protected long created, subtotal, total;
	protected String id;
	protected Lines lines;
	protected Discount discount;

	public Invoice() {
	}

	public Invoice(long created, long subtotal, long total, String id,
			Lines lines, Discount discount) {
		super();
		this.created = created;
		this.subtotal = subtotal;
		this.total = total;
		this.id = id;
		this.lines = lines;
		this.discount = discount;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public long getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(long subtotal) {
		this.subtotal = subtotal;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Lines getLines() {
		return lines;
	}

	public void setLines(Lines lines) {
		this.lines = lines;
	}

	public Discount getDiscount() {
		return this.discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
}
