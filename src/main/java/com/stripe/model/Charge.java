package com.stripe.model;

public class Charge {
	protected boolean attempted;
	protected boolean refunded;
	protected boolean paid;
	protected long amount;
	protected Card card;
	protected String id;
	protected boolean livemode;
	protected String description;
	protected String currency;
	protected String object;
	protected long created;

	public Charge() {
	}

	public Charge(boolean attempted, boolean refunded, boolean paid,
			long amount, Card card, String id, boolean livemode,
			String description, String currency, String object, long created) {
		super();
		this.attempted = attempted;
		this.refunded = refunded;
		this.paid = paid;
		this.amount = amount;
		this.card = card;
		this.id = id;
		this.livemode = livemode;
		this.description = description;
		this.currency = currency;
		this.object = object;
		this.created = created;
	}

	public boolean isAttempted() {
		return attempted;
	}

	public void setAttempted(boolean attempted) {
		this.attempted = attempted;
	}

	public boolean isRefunded() {
		return refunded;
	}

	public void setRefunded(boolean refunded) {
		this.refunded = refunded;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
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

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

}
