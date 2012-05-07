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
	Boolean disputed;
	Integer fee;
	String description;
	String failureMessage;
	Integer amountRefunded;
	String customer;
	String invoice;
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

	public Boolean getDisputed() {
		return disputed;
	}

	public void setDisputed(Boolean disputed) {
		this.disputed = disputed;
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
	
	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

	public Integer getAmountRefunded() {
		return amountRefunded;
	}

	public void setAmountRefunded(Integer amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
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
