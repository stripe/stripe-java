package com.stripe.model;

public final class SourceReceiverFlow extends StripeObject {
	String refundAttributesStatus;
	String refundAttributesMethod;
	Integer amountReceived;
	Integer amountReturned;
	Integer amountCharged;
	String address;

	public String getRefundAttributesStatus() {
		return refundAttributesStatus;
	}

	public void setRefundAttributesStatus(String refundAttributesStatus){
		this.refundAttributesStatus = refundAttributesStatus;
	}

	public String getRefundAttributesMethod() {
		return refundAttributesMethod;
	}

	public void setRefundAttributesMethod(String refundAttributesMethod){
		this.refundAttributesMethod = refundAttributesMethod;
	}

	public Integer getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(Integer amountReceived){
		this.amountReceived = amountReceived;
	}

	public Integer getAmountReturned() {
		return amountReturned;
	}

	public void setAmountReturned(Integer amountReturned){
		this.amountReturned = amountReturned;
	}

	public Integer getAmountCharged() {
		return amountCharged;
	}

	public void setAmountCharged(Integer amountCharged){
		this.amountCharged = amountCharged;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address){
		this.address = address;
	}
}
