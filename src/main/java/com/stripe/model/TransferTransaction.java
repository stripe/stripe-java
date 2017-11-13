package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferTransaction extends StripeObject implements HasId {
	String id;
	String object;
	Long amount;
	Long net;
	String type;
	Long created;
	String description;
	Long fee;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getNet() {
		return net;
	}

	public void setNet(Long net) {
		this.net = net;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getFee() {
		return fee;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}
}
