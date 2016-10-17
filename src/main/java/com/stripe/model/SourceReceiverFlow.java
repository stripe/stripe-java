package com.stripe.model;

public final class SourceReceiverFlow extends StripeObject {
	String refundAttributesStatus;
	String refundAttributesMethod;
	Long amountReceived;
	Long amountReturned;
	Long amountCharged;
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

	public Long getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(Long amountReceived){
		this.amountReceived = amountReceived;
	}

	public Long getAmountReturned() {
		return amountReturned;
	}

	public void setAmountReturned(Long amountReturned){
		this.amountReturned = amountReturned;
	}

	public Long getAmountCharged() {
		return amountCharged;
	}

	public void setAmountCharged(Long amountCharged){
		this.amountCharged = amountCharged;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address){
		this.address = address;
	}
}
