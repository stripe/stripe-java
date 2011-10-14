package com.stripe.model;

import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class Invoice extends APIResource {
	Integer subtotal;
	Integer total;
	String id;
	Long created;
	Boolean attempted;
	String charge;
	Boolean closed;
	String customer;
	Long date;
	Boolean paid;
	Long periodStart;
	Long periodEnd;
	Discount discount;
	InvoiceLines lines;
	
	public Integer getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Integer subtotal) {
		this.subtotal = subtotal;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public Boolean getAttempted() {
		return attempted;
	}

	public void setAttempted(Boolean attempted) {
		this.attempted = attempted;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public Boolean getClosed() {
		return closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Long getPeriodStart() {
		return periodStart;
	}

	public void setPeriodStart(Long periodStart) {
		this.periodStart = periodStart;
	}

	public Long getPeriodEnd() {
		return periodEnd;
	}

	public void setPeriodEnd(Long periodEnd) {
		this.periodEnd = periodEnd;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public InvoiceLines getLines() {
		return lines;
	}

	public void setLines(InvoiceLines lines) {
		this.lines = lines;
	}

	public static Invoice retrieve(String id) throws StripeException {
		return request(RequestMethod.GET, instanceURL(Invoice.class, id), null, Invoice.class);
	}
	
	public static InvoiceCollection all(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.GET, classURL(Invoice.class), params, InvoiceCollection.class);
	}
		
	public static Invoice upcoming(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.GET, String.format("%s/upcoming", classURL(Invoice.class)),
				params, Invoice.class);
	}
}