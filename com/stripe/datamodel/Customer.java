package com.stripe.datamodel;

public class Customer {
	protected String description;
	protected boolean livemode;
	protected long created;
	protected Card active_card;
	protected String id;
	
	public Customer(){		
	}
	
	public Customer(String description, boolean livemode, long created,
			Card active_card, String id) {
		super();
		this.description = description;
		this.livemode = livemode;
		this.created = created;
		this.active_card = active_card;
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isLivemode() {
		return livemode;
	}
	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public Card getActive_card() {
		return active_card;
	}
	public void setActive_card(Card active_card) {
		this.active_card = active_card;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
