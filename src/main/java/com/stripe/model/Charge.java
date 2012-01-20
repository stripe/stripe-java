package com.stripe.model;

import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class Charge extends APIResource {
	Integer amount;
	Long created;
	String currency;
	String id;
	Boolean livemode;
	Boolean paid;
	Boolean refunded;
	Integer fee;
	String description;
	Integer amountRefunded;
	Card card;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Boolean getRefunded() {
		return refunded;
	}

	public void setRefunded(Boolean refunded) {
		this.refunded = refunded;
	}

	public Integer getFee() {
		return fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getAmountRefunded() {
		return amountRefunded;
	}

	public void setAmountRefunded(Integer amountRefunded) {
		this.amountRefunded = amountRefunded;
	}
	
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	
	public static Charge create(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST, classURL(Charge.class), params, Charge.class);
	}

	public static Charge retrieve(String id) throws StripeException {
		return request(RequestMethod.GET, instanceURL(Charge.class, id), null, Charge.class);
	}

	public static ChargeCollection all(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.GET, classURL(Charge.class), params, ChargeCollection.class);
	}

	public Charge refund() throws StripeException {
        return this.refund(null); // full refund
    }

	public Charge refund(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST,
				String.format("%s/refund", instanceURL(Charge.class, this.getId())),
				params, Charge.class);
	}
}
